package com.dinobuilding.dinosaur;

/**
 * Created by Nate on 10/31/2014.
 */
public class Dinosaurs {

    public static Dinosaur[] listOfExistingDinosaurs = new Dinosaur[] {};

    public void initializeDinosaurs() {
        for (int i = 0; i < listOfExistingDinosaurs.length; i++) {
            listOfExistingDinosaurs[i].initialize();
        }
    }
}
