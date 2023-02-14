package pl.javastart.task;

public class Garage {

    Vehicle[] vehicles = new Vehicle[4];

    void printInfo() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }
    }
}
