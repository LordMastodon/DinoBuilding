package com.dinobuilding.utilities;

import javax.swing.*;

/**
 * Created by Nate on 11/28/2014.
 */
public class DinoBuildingObject {

    ImageIcon displayImage;

    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setDisplayImage(ImageIcon icon) {
        this.displayImage = icon;
    }

    public ImageIcon getDisplayImage() {
        return displayImage;
    }

}
