package ua.lviv.iot.Tool.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.Tool.models.FurnitureType;
import ua.lviv.iot.Tool.models.Tools;

public class ToolManager implements IToolManager {
	private List<Tools> tools;

	public ToolManager() {

	}

	public ToolManager(List<Tools> tools) {
		this.tools = tools;
	}

	public List<Tools> getTools() {
		return tools;
	}

	public void setTools(List<Tools> tools) {
		this.tools = tools;
	}

	@Override
	public void sortByVoltage(List<Tools> tools, boolean reverse) {
		if (reverse) {
			Collections.sort(tools, Comparator.comparing(Tools::getVoltage).reversed());
		} else {
			Collections.sort(tools, Comparator.comparing(Tools::getVoltage));
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void sortByProducer(List<Tools> tools, boolean ascending) {
		if (ascending) {
			Collections.sort(tools, Comparator.comparing(Tools::getProducer).reversed());
		} else {
			Collections.sort(tools, Comparator.comparing(Tools::getProducer));
		}

		// TODO Auto-generated method stub
	}

	public List<Tools> findByFurnitureType(FurnitureType furnitureType) {
		List<Tools> toolList = tools;
		List<Tools> findToolsList = toolList.stream().filter(tool -> tool.getFurnitureType() == furnitureType)
				.collect(Collectors.toList());
		return findToolsList;
	}
}
