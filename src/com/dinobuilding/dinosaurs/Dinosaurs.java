package com.dinobuilding.dinosaurs;

/**
 * Created by Nate on 10/31/2014.
 */
public class Dinosaurs {

    Dinosaur[] listOfExistingDinosaurs = new Dinosaur[] {};

    public void initializeDinosaurs() {
        for (int i = 0; i < listOfExistingDinosaurs.length; i++) {
            listOfExistingDinosaurs[i].initialize();
        }
    }
}
