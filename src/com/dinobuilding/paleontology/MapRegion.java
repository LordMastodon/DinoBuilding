package com.dinobuilding.paleontology;

import com.dinobuilding.dinosaur.Dinosaur;
import com.dinobuilding.utilities.DinoBuildingGameObject;
import com.dinobuilding.utilities.DinoBuildingMapObject;

import javax.swing.*;

/**
 * Created by Nate on 11/28/2014.
 */
public class MapRegion extends DinoBuildingMapObject {
    int x;
    int y;

    ImageIcon displayImage;

    Dinosaur[] possibleDinosaurs = new Dinosaur[]{};

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setDisplayImage(String name) {
        this.displayImage = new ImageIcon("resources/mapregions/" + name + ".png");
    }

    public ImageIcon getDisplayImage() {
        return displayImage;
    }

    public void setPossibleDinosaurs(Dinosaur[] possibleDinosaurs) {
        this.possibleDinosaurs = possibleDinosaurs;
    }

    public boolean isPossibleDinosaur(Dinosaur dinosaur) {
        for (int i = 0; i < possibleDinosaurs.length; i++) {
            if (dinosaur == possibleDinosaurs[i]) {
                return true;
            }
        }

        return false;
    }

    public Dinosaur[] getPossibleDinosaurs() {
        return possibleDinosaurs;
    }
}
