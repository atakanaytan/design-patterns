package strategy.vehicle;

import strategy.fuel.impl.SportFuelMode;
import strategy.road.impl.UrbanRoadType;
import strategy.vehicle.Car;

public class HeluxVehicle extends Car {

    public HeluxVehicle () {
        super.fuelMode = new SportFuelMode();
        super.roadMode = new UrbanRoadType();
    }

    @Override
    public void startEngine() {

        System.out.println("Helux started the engine");
    }
}
