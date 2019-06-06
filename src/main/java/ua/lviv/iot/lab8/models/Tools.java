package ua.lviv.iot.lab8.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import ua.lviv.iot.lab8.models.Function;

@Entity
public class Tools {
	private String name;
	private int voltage;
	private String producer;
	private int price;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Enumerated(value = EnumType.STRING)
	private Function function;
	private FurnitureType furnitureType;

	public Tools() {

	}

	public Tools(String name, int voltage, Function function, String producer, int price, FurnitureType furnitureType) {
		this.name = name;
		this.voltage = voltage;
		this.function = function;
		this.producer = producer;
		this.price = price;
		this.furnitureType = furnitureType;
	}

	public String toString() {
		return "Tools {" + "Name : " + name + "," + "Voltage : " + voltage + "," + "Function : " + function + ","
				+ "Producer : " + producer + "," + "Price : " + price + "," + "FurnitureType : " + furnitureType + ",";
	}

	public String getHeaders() {
		return "Tools {" + "Name : " + "Voltage : " + "," + "Function : " + "," + "Producer : " + "," + "Price : " + ","
				+ "FurnitureType : " + ",";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public FurnitureType getFurnitureType() {
		return furnitureType;
	}

	public void setFurnitureType(FurnitureType furnitureType) {
		this.furnitureType = furnitureType;
	}

}
