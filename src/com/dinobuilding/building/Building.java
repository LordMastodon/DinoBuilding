package com.dinobuilding.building;

import com.dinobuilding.utilities.DinoBuildingGameObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nate on 10/31/2014.
 */
public class Building extends DinoBuildingGameObject {
    List<Floor> floors = new ArrayList<Floor>();

    public void appendToFloors(Floor floor) {
        floors.add(floor);
    }

}
