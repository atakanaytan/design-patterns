package strategy.fuel.impl;

import strategy.fuel.FuelMode;

public class NormalFuelMode implements FuelMode {
    public void perform() {
        System.out.println("Normal fuel Mode activated");
    }
}
