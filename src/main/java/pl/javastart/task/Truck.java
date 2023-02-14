package pl.javastart.task;

public class Truck extends Car {

    private static final double EXTRA_FUEL_CONSUMPTION_AIR_CONDITION_ON = 1.6;

    private static final double EXTRA_FUEL_CONSUMPTION_WITH_100KG_LOAD = 0.5;
    private double loadWeight;

    public Truck(String name, double tankCapacity, double fuelConsumption, boolean airCondition, double loadWeight) {
        super(name, tankCapacity, fuelConsumption, airCondition);
        this.loadWeight = loadWeight;
    }

    @Override
    double calculateFuelConsumption() {
        double fuelConsumption = getFuelConsumption();
        if (isAirCondition()) {
            fuelConsumption += EXTRA_FUEL_CONSUMPTION_AIR_CONDITION_ON;
        }
        if (loadWeight != 0) {
            fuelConsumption += EXTRA_FUEL_CONSUMPTION_WITH_100KG_LOAD * (loadWeight / 100);
        }
        return fuelConsumption;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", WAGA ŁADUNKU: " + loadWeight + "kg";
    }
}
