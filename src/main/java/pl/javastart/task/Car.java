package pl.javastart.task;

public class Car extends Vehicle {

    private static final double EXTRA_FUEL_CONSUMPTION_AIR_CONDITION_ON = 0.8;
    private boolean airCondition;

    public Car(String name, double tankCapacity, double fuelConsumption, boolean airCondition) {
        super(name, tankCapacity, fuelConsumption);
        this.airCondition = airCondition;
    }

    @Override
    double calculateFuelConsumption() {
        double fuelConsumption = super.calculateFuelConsumption();
        if (airCondition) {
            fuelConsumption += EXTRA_FUEL_CONSUMPTION_AIR_CONDITION_ON;
        }
        return fuelConsumption;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", KLIMATYZACJA ON: " + airCondition +
                ", ZASIĘG POJAZDU: " + calculateRange() + "km";
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }
}