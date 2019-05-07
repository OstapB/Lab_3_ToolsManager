package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.Tool.managers.ToolManager;
import ua.lviv.iot.Tool.models.Function;
import ua.lviv.iot.Tool.models.FurnitureType;
import ua.lviv.iot.Tool.models.HammerMachine;
import ua.lviv.iot.Tool.models.PressMachine;
import ua.lviv.iot.Tool.models.Screwdriver;
import ua.lviv.iot.Tool.models.Tools;

class TestToolsManager {
    List<Tools> testTools;
    ToolManager testManager = new ToolManager();

    Screwdriver screwdriver = new Screwdriver("Flash", 220, Function.CUTTING, "Germany", 1000, FurnitureType.IRON, 300);
    PressMachine pressmachine = new PressMachine("Hulk", 210, "Italy", Function.FASTENING, 1500, FurnitureType.IRON,
            200);
    HammerMachine hammerMachine = new HammerMachine("Smasher", 250, Function.SHAPING, "Ukraine", 900,
            FurnitureType.WOODEN, 500, 60);

    @BeforeEach
    void setUp() {
        testTools = new ArrayList<>();
        testTools.add(screwdriver);
        testTools.add(pressmachine);
        testTools.add(hammerMachine);
    }

    @Test
    void testSortByVoltage() {
        testManager.sortByVoltage(testTools, true);
        Assertions.assertEquals(250, testTools.get(0).getVoltage());
        Assertions.assertEquals(220, testTools.get(1).getVoltage());
        Assertions.assertEquals(210, testTools.get(2).getVoltage());
    }

    @Test
    void testSortByProducer() {
        testManager.sortByProducer(testTools, true);
        Assertions.assertEquals("Ukraine", testTools.get(0).getProducer());
    }

    @Test
    void testFindByFurnitureType() {
        testManager.findByFurnitureType(testTools, FurnitureType.IRON);
        Assertions.assertEquals(FurnitureType.IRON, testTools.get(0).getFurnitureType());
        Assertions.assertEquals(FurnitureType.IRON, testTools.get(1).getFurnitureType());
        Assertions.assertEquals(FurnitureType.WOODEN, testTools.get(2).getFurnitureType());

    }

}
