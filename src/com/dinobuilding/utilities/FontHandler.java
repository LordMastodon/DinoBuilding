package com.dinobuilding.utilities;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Nate on 3/22/2015.
 */
public class FontHandler {

    public static Font getFont() {
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File("resources/font/DinoBuilding.ttf"));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
