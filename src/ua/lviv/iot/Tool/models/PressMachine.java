package ua.lviv.iot.Tool.models;

public class PressMachine extends Tools {
	private int power;

	public PressMachine() {
	}

	public PressMachine(String name, int voltage, String producer, Function function, int price,
			FurnitureType furnitureType, int power) {
		super(name, voltage, function, producer, price, furnitureType);
		this.power = power;

	}

	public String toString() {
		return super.toString() + "Power" + power + "}";

	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
