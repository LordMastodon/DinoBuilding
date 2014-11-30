package com.dinobuilding.building;

import com.dinobuilding.utilities.DinoBuildingGameObject;

/**
 * Created by Nate on 10/31/2014.
 */
public class Building extends DinoBuildingGameObject {
    Floor[] floors = new Floor[]{};

    int newSlot;

    public void appendToFloors(Floor floor) {
        newSlot = floors.length + 1;
        floors[newSlot] = floor;
    }

}
