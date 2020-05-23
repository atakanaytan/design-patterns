package strategy.road.impl;

import strategy.road.RoadType;

public class UrbanRoadType implements RoadType {

    @Override
    public void apply() {
        System.out.println("Urban road mode activated");
    }
}
