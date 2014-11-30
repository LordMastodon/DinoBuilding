package com.dinobuilding.building;

import com.dinobuilding.dinosaur.Dinosaur;
import com.dinobuilding.dinosaur.Dinosaurs;
import com.dinobuilding.utilities.DinoBuildingGameObject;

import javax.swing.*;

/**
 * Created by Nate on 10/31/2014.
 */
public class Floor extends DinoBuildingGameObject {
    Dinosaur dinosaur;

    ImageIcon displayImage;

    int floorNumber;

    public void setFloorNumber(int floorNum) {
        this.floorNumber = floorNum;
    }

    public void setDinosaur(Dinosaur dino) {
        for (int i = 0; i < Dinosaurs.listOfExistingDinosaurs.length; i++) {
            if(dino == Dinosaurs.listOfExistingDinosaurs[i]) {
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
