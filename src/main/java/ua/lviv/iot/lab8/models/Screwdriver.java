package ua.lviv.iot.lab8.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Screwdriver extends Tools {
	private int speed;

	@Enumerated(value = EnumType.STRING)
	private Function function;
	private FurnitureType furnitureType;

	public Screwdriver(String name, int voltage, Function function, String producer, int price,
			FurnitureType furnitureType, int speed) {
		super();
		this.speed = speed;
	}

	public Screwdriver() {
	}

	public String toString() {
		return super.toString() + "Speed" + speed + "}";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
