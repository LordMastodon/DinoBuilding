package com.dinobuilding.utilities;

import javax.swing.*;

/**
 * Created by Nate on 11/8/2014.
 */
public class Image extends ImageIcon {

    ImageIcon icon;
    String name;

    public Image(String name) {
        this.name = name;
    }

    public ImageIcon getImage(String name) {
        icon = new ImageIcon("");
        return icon;
    }

}
