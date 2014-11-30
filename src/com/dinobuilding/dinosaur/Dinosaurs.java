package com.dinobuilding.dinosaur;

/**
 * Created by Nate on 10/31/2014.
 */
public class Dinosaurs {

    public static Dinosaur[] listOfExistingDinosaurs = new Dinosaur[] {};

    int newSlot;

    public void appendToListOfExistingDinosaurs(Dinosaur dino) {
        newSlot = listOfExistingDinosaurs.length + 1;
        listOfExistingDinosaurs[newSlot] = dino;
    }

    public void initializeDinosaurs() {
        for (int i = 0; i < listOfExistingDinosaurs.length; i++) {
            listOfExistingDinosaurs[i].initialize();
        }
    }
}
