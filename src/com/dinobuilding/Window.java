package com.dinobuilding;

import java.awt.EventQueue;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.swing.*;

public class Window {

    public static int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
    public static int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;

    public static ImageIcon background = new ImageIcon("resources/images/Background.png");

    public static ImageObserver observer;

    public Window() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("DinoBuilding");

                try {
                    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setResizable(false);
                try {
                    frame.add(new MainView());
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                frame.pack();
                frame.setSize(screenWidth, screenHeight);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new Window();
    }

}