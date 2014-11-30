package com.dinobuilding.utilities;

/**
 * Created by Nate on 11/28/2014.
 */
public class RenderManagerForGameScreen {
    public static DinoBuildingGameObject[] objectsToRender = new DinoBuildingGameObject[]{};

    int newSlot = objectsToRender.length + 1;

    public void appendToObjectsToRender(DinoBuildingGameObject dbo) {
        objectsToRender[newSlot] = dbo;
    }
}
