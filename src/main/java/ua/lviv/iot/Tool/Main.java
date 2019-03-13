package ua.lviv.iot.Tool;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.Tool.managers.ToolManager;
import ua.lviv.iot.Tool.models.Function;
import ua.lviv.iot.Tool.models.FurnitureType;
import ua.lviv.iot.Tool.models.HammerMachine;
import ua.lviv.iot.Tool.models.PressMachine;
import ua.lviv.iot.Tool.models.Screwdriver;
import ua.lviv.iot.Tool.models.Tools;

public class Main {

    public static void main(String[] args) {
        ToolManager manager = new ToolManager();

        Screwdriver screwdriver = new Screwdriver("Flash", 220, Function.CUTTING, "Germany", 1000, FurnitureType.WOODEN,
                300);
        PressMachine pressmachine = new PressMachine("Hulk", 210, "Italy", Function.FASTENING, 1500, FurnitureType.IRON,
                200);
        HammerMachine hammerMachine = new HammerMachine("Smasher", 250, Function.SHAPING, "Ukraine", 900,
                FurnitureType.IRON, 500, 60);

        List<Tools> listTool = new ArrayList();
        listTool.add(screwdriver);
        listTool.add(pressmachine);
        listTool.add(hammerMachine);

        manager.sortByVoltage(listTool, true);
        System.out.print(listTool);
        System.out.println();
        manager.sortByProducer(listTool, true);
        System.out.print(listTool);

    }

}
