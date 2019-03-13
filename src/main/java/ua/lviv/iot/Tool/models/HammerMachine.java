package ua.lviv.iot.Tool.models;

public class HammerMachine extends Tools {
    private int weight;
    private int temperature;

    public HammerMachine() {
    }

    public HammerMachine(String name, int voltage, Function function, String producer, int price,
            FurnitureType furnitureType, int weight, int temperature) {
        super(name, voltage, function, producer, price, furnitureType);
        this.weight = weight;
        this.temperature = temperature;
    }

    public String toString() {
        return super.toString() + "Weight" + weight + "Temperature" + temperature + "}";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
