package com.dinobuilding.building;

import com.dinobuilding.dinosaur.Dinosaur;
import com.dinobuilding.dinosaur.Dinosaurs;
import com.dinobuilding.utilities.DinoBuildingGameObject;

import javax.swing.*;

/**
 * Created by Nate on 10/31/2014.
 */
public class Floor extends DinoBuildingGameObject {
    private Dinosaur dinosaur;

    ImageIcon displayImage;

    int floorNumber;

    public void setFloorNumber(int floorNum) {
        this.floorNumber = floorNum;
    }

    public void setDinosaur(Dinosaur dino) {

        //This makes sure that it's a valid dinosaur
        for (int i = 0; i < Dinosaurs.listOfExistingDinosaurs.size(); i++) {
            if(dino == Dinosaurs.listOfExistingDinosaurs.get(i)) {
                this.dinosaur = dino;
            }
        }
    }

    public Dinosaur getDinosaur() {
        return dinosaur;
    }

    public void setDisplayImage(Dinosaur dino) {
        this.displayImage = new ImageIcon("resources/floors/" + dino.getName() + "Floor.png");
    }

    public ImageIcon getDisplayImage() {
        return displayImage;
    }

}
