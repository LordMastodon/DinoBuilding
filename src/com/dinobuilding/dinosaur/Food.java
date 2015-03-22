package com.dinobuilding.dinosaur;

/**
 * Created by Nate on 2/16/2015.
 */
public class Food {

    Hunger hunger;

    public void onEaten(boolean reduce, int change) {
        hunger.changeHunger(reduce, change);
    }

}
