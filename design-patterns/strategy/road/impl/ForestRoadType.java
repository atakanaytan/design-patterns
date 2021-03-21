package strategy.road.impl;

import strategy.road.RoadType;

public class ForestRoadType implements RoadType {

    @Override
    public void apply() {
        System.out.println("Forest road mode activated");
    }
}
