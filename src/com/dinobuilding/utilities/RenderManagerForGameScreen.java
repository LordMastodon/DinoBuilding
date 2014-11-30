package com.dinobuilding.utilities;

/**
 * Created by Nate on 11/28/2014.
 */
public class RenderManagerForGameScreen {
    public static DinoBuildingGameObject[] objectsToRender = new DinoBuildingGameObject[]{};

    int newSlot;

    public void appendToObjectsToRender(DinoBuildingGameObject dbo) {
        newSlot = objectsToRender.length + 1;
        objectsToRender[newSlot] = dbo;
    }
}
