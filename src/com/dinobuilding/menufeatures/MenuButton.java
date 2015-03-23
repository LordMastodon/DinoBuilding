package com.dinobuilding.menufeatures;

import com.dinobuilding.utilities.FontHandler;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

@SuppressWarnings("serial")
public class MenuButton extends JButton {

    public ImageIcon greenButton = new ImageIcon("resources/menubuttons/GreenButton.png");

    public ImageIcon redButton = new ImageIcon("resources/menubuttons/RedButton.png");

    public Font gameFont = FontHandler.getFont();

    public MenuButton(String text, String actionCommand, int x, int y) throws FontFormatException, IOException {
        this.setText(text);
        this.setIcon(greenButton);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
        this.setActionCommand(actionCommand);
        this.setBounds(x, y, 300, 100);
        this.setFont(gameFont.deriveFont(Font.PLAIN, 24));
        this.setRolloverEnabled(true);
        this.setRolloverIcon(redButton);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
    }

}
