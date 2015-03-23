package com.dinobuilding.paleontology;

import com.dinobuilding.dinosaur.Dinosaur;
import com.dinobuilding.dinosaur.Dinosaurs;
import com.dinobuilding.utilities.DinoBuildingGameObject;
import com.dinobuilding.utilities.DinoBuildingMapObject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nate on 11/28/2014.
 */
public class MapRegion extends DinoBuildingMapObject {
    int x;
    int y;

    ImageIcon displayImage;

    public List<Dinosaur> possibleDinosaurs = new ArrayList<Dinosaur>();

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

    public void setPossibleDinosaurs(ArrayList<Dinosaur> possibleDinosaurs) {
        this.possibleDinosaurs = possibleDinosaurs;
    }

    public boolean isPossibleDinosaur(Dinosaur dinosaur) {
        if(possibleDinosaurs.contains(dinosaur)) {
            return true;
        }

        return false;
    }

    public List<Dinosaur> getPossibleDinosaurs() {
        return possibleDinosaurs;
    }
}