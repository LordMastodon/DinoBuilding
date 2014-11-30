package com.dinobuilding.utilities;

/**
 * Created by Nate on 11/28/2014.
 */
public class RenderManagerForGameScreen {
    public static DinoBuildingObject[] objectsToRender = new DinoBuildingObject[]{};

    int newSlot = objectsToRender.length + 1;

    public void appendToObjectsToRender(DinoBuildingObject dbo) {
        objectsToRender[newSlot] = dbo;
    }
}
