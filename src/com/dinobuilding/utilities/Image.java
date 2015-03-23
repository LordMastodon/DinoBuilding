package com.dinobuilding.utilities;

import javax.swing.*;

/**
 * Created by Nate on 11/8/2014.
 */
public class Image extends ImageIcon {

    ImageIcon icon;
    String name;

    public Image(String pathToImage, String name) {
        super(pathToImage);

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
