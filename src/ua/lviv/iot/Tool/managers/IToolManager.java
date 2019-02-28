package ua.lviv.iot.Tool.managers;

import java.util.List;

import ua.lviv.iot.Tool.models.Tools;

public interface IToolManager {

	public void sortByVoltage(List<Tools> tools, boolean reverse);

	public void sortByProducer(List<Tools> tools, boolean reverse);
}
