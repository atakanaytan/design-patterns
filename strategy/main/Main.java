package strategy.main;

import strategy.vehicle.Car;
import strategy.vehicle.SUVVehicle;

public class Main {
    public static void main(String[] args) {

        Car car = new SUVVehicle();
        car.drive();
    }
}
