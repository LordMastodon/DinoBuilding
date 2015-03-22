package com.dinobuilding.dinosaur;

import javax.swing.*;

import com.dinobuilding.dinosaurdata.Age;
import com.dinobuilding.events.EnragedEvent;
import com.dinobuilding.events.WrongFoodEatenEvent;
import com.dinobuilding.dinosaurdata.Diet;
import com.dinobuilding.paleontology.MapRegions;
import com.dinobuilding.parties.DinosaurBehaviorAtParties;
import com.dinobuilding.utilities.DinoBuildingGameObject;

public class Dinosaur extends DinoBuildingGameObject {
    boolean enraged = false;

//    Age age;

    EnragedEvent onEnraged;
    WrongFoodEatenEvent onWrongFoodEaten;

    Diet diet;

    DinosaurBehaviorAtParties dinosaurBehaviorAtParties;

    MapRegions mapRegions;

    String description;
    String name;

    public int hunger;

    static ImageIcon icon;

    public void setIcon(String name) {
        icon = new ImageIcon("resources/dinosaurs/" + name + ".png");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
// Age stuff is for a later time
//    static ImageIcon babyIcon;
//    static ImageIcon childIcon;
//    static ImageIcon teenagerIcon;
//    static ImageIcon adultIcon;
//    static ImageIcon elderlyIcon;

//    public void setBabyIcon(String name) {
//        babyIcon = new ImageIcon("resources/dinosaurs/" + name + ".png");
//    }
//
//    public Icon getBabyIcon() {
//        return babyIcon;
//    }
//
//    public void setChildIcon(String name) {
//        childIcon = new ImageIcon("resources/dinosaurs/" + name + ".png");
//    }
//
//    public Icon getChildIcon() {
//        return childIcon;
//    }
//
//    public void setTeenagerIcon(String name) {
//        teenagerIcon = new ImageIcon("resources/dinosaurs/" + name + ".png");
//    }
//
//    public Icon getTeenagerIcon() {
//        return teenagerIcon;
//    }
//
//    public void setAdultIcon(String name) {
//        adultIcon = new ImageIcon("resources/dinosaurs/" + name + ".png");
//    }
//
//    public Icon getAdultIcon() {
//        return adultIcon;
//    }
//
//    public void setElderlyIcon(String name) {
//        elderlyIcon = new ImageIcon("resources/dinosaurs/" + name + ".png");
//    }
//
//    public Icon getElderlyIcon() {
//        return elderlyIcon;
//    }

    public void initialize() {

    }

    public void setHunger(int i) {
        this.hunger = i;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDinosaurBehaviorAtParties(DinosaurBehaviorAtParties dinosaurBehaviorAtParties) {
        this.dinosaurBehaviorAtParties = dinosaurBehaviorAtParties;
    }

    public DinosaurBehaviorAtParties getDinosaurBehaviorAtParties() {
        return dinosaurBehaviorAtParties;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setOnEnragedEvent(EnragedEvent e) {
        this.onEnraged = e;
    }

    public EnragedEvent getOnEnragedEvent() {
        return onEnraged;
    }

    public boolean onEnraged() {
        if(enraged) {
            this.onEnraged.enrage();
            return enraged;
        } else {
            return enraged;
        }
    }

    public void setOnWrongFoodEatenEvent(WrongFoodEatenEvent e) {
        this.onWrongFoodEaten = e;
    }

    public WrongFoodEatenEvent getOnWrongFoodEatenEvent() {
        return onWrongFoodEaten;
    }

//    public boolean setOnWrongFoodEaten() {
//        if(wrongFoodEaten) {
//            this.onWrongFoodEaten.onWrongFoodEaten();
//            return wrongFoodEaten;
//        } else {
//            return wrongFoodEaten;
//        }
//    }

    public void setMapRegions(MapRegions mapRegions) {
        this.mapRegions = mapRegions;
    }

    public MapRegions getMapRegions() {
        return mapRegions;
    }

}
