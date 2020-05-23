package strategy.vehicle;

import strategy.fuel.impl.EcoFuelMode;
import strategy.fuel.FuelMode;
import strategy.road.impl.ForestRoadType;
import strategy.road.RoadType;

public abstract class Car {

    FuelMode fuelMode;
    RoadType roadMode;

    public void drive() {
        if (fuelMode instanceof EcoFuelMode &&
                roadMode instanceof ForestRoadType) {
            throw new IllegalStateException(" These two types are incompatible");
        }

        fuelMode.perform();
        roadMode.apply();
        startEngine();
    }

    public abstract void startEngine();
}
