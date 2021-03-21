package strategy.fuel.impl;

import strategy.fuel.FuelMode;

public class SportFuelMode implements FuelMode {

    @Override
    public void perform() {
        System.out.println("Sport fuel mode activated");
    }
}
