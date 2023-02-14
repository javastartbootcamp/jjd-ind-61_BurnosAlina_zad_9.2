package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();
        garage.vehicles[0] = new Car("BMW", 50, 5, true);
        garage.vehicles[1] = new Car("Toyota", 55, 5, true);
        garage.vehicles[2] = new Truck("Honda", 57, 4.5, true, 1500);
        garage.vehicles[3] = new Truck("Mercedes", 70, 7, true, 500);
        garage.printInfo();
    }
}
