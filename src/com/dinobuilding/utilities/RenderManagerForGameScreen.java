package com.dinobuilding.utilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nate on 11/28/2014.
 */
public class RenderManagerForGameScreen {
    public static List<DinoBuildingGameObject> objectsToRender = new ArrayList<DinoBuildingGameObject>();

    public void appendToObjectsToRender(DinoBuildingGameObject dbo) {
        objectsToRender.add(dbo);
    }
}
