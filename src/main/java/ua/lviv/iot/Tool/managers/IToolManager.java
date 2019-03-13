package ua.lviv.iot.Tool.managers;

import java.util.List;

import ua.lviv.iot.Tool.models.Tools;

public interface IToolManager {

    void sortByVoltage(List<Tools> tools, boolean reverse);

    void sortByProducer(List<Tools> tools, boolean reverse);
}
