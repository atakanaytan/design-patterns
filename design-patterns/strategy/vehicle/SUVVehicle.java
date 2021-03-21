package strategy.vehicle;

import strategy.fuel.impl.SportFuelMode;
import strategy.road.impl.UrbanRoadType;
import strategy.vehicle.Car;

public class SUVVehicle extends Car {

    public SUVVehicle() {
        super.fuelMode = new SportFuelMode();
        super.roadMode = new UrbanRoadType();
    }

    @Override
    public void startEngine() {
        System.out.println("SUV vehicle started the engine");
    }
}
