package com.dinobuilding.dinosaur;

/**
 * Created by Nate on 2/16/2015.
 */
public class Hunger {

    private Dinosaur dino = new Dinosaur();

    public void setDino(Dinosaur dino1) {
        this.dino = dino1;
    }

    public Dinosaur getDino() {
        return this.dino;
    }

    public void changeHunger(boolean reduce, int change) {
        if(reduce) {
            dino.hunger = dino.hunger - change;
        } else if(!reduce) {
            dino.hunger = dino.hunger + change;
        }
    }

}
