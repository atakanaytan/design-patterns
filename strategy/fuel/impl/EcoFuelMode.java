package strategy.fuel.impl;

import strategy.fuel.FuelMode;

public class EcoFuelMode implements FuelMode {

    @Override
    public void perform() {
        System.out.println("Eco mode activated");
    }
}
