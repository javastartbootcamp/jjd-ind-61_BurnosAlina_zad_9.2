package pl.javastart.task;

public class Vehicle {

    private String name;
    private double tankCapacity;
    private double fuelConsumption;

    public Vehicle(String name, double tankCapacity, double fuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    double calculateFuelConsumption() {
        return fuelConsumption;
    }

    double calculateRange() {
        return (tankCapacity / calculateFuelConsumption()) * 100;
    }

    String getInfo() {
        return name + ", POJEMNOŚĆ BAKU: " + tankCapacity + ", ŚREDNIE SPALANIE NA 100KM: "
                + fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
