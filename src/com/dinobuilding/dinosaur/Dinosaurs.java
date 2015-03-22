package com.dinobuilding.dinosaur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nate on 10/31/2014.
 */
public class Dinosaurs {

    public static List<Dinosaur> listOfExistingDinosaurs = new ArrayList<Dinosaur>();

    public void appendToListOfExistingDinosaurs(Dinosaur dino) {
        listOfExistingDinosaurs.add(dino);
    }

    public void initializeDinosaurs() {
        for (int i = 0; i < listOfExistingDinosaurs.size(); i++) {
            listOfExistingDinosaurs.get(i).initialize();
        }
    }
}
