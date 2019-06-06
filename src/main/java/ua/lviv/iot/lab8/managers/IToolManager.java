package ua.lviv.iot.lab8.managers;

import java.util.List;

import ua.lviv.iot.lab8.models.FurnitureType;
import ua.lviv.iot.lab8.models.Tools;

public interface IToolManager {

	void sortByVoltage(List<Tools> tools, boolean reverse);

	void sortByProducer(List<Tools> tools, boolean reverse);

	List<Tools> findByFurnitureType(List<Tools> tools, FurnitureType furnitureType);
}
