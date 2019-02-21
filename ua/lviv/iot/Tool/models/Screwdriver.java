package ua.lviv.iot.Tool.models;

public class Screwdriver extends Tools {
	private int speed;

	public Screwdriver() {
}

	public Screwdriver(String name, int voltage,Function function, String producer, int price,FurnitureType furnitureType,int speed) {
		super(name, voltage, function, producer, price, furnitureType);
			this.speed = speed;
		}
	
		
	public String toString() {
		return super.toString() + 
				"Speed" + speed +
				"}";
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
