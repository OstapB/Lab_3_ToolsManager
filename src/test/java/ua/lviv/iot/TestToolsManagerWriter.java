package ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.Tool.models.Function;
import ua.lviv.iot.Tool.models.FurnitureType;
import ua.lviv.iot.Tool.models.HammerMachine;
import ua.lviv.iot.Tool.models.PressMachine;
import ua.lviv.iot.Tool.models.Screwdriver;
import ua.lviv.iot.Tool.models.Tools;

public class TestToolsManagerWriter {

    List<Tools> testTools;

    private String filePath = "csvFile";

    ToolsWriter toolsWriter = new ToolsWriter();
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

        toolsWriter = new ToolsWriter(filePath);

    }

    @Test
    void testWriterToFile() {
        File csvFile = new File(filePath + ".csv");
        toolsWriter.writeToFile(testTools);

        try (FileInputStream fis = new FileInputStream(csvFile);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader bufReader = new BufferedReader(isr);) {

            for (Tools tools : testTools) {
                assertEquals(tools.getHeaders(), bufReader.readLine());
                assertEquals(tools.toCSV(), bufReader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
