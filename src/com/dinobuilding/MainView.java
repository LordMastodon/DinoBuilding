package com.dinobuilding;

import java.awt.CardLayout;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;

import com.dinobuilding.screens.BuildingScreen;
import com.dinobuilding.screens.HowToPlayScreen;
import com.dinobuilding.screens.MainMenuScreen;
import com.dinobuilding.screens.OptionsScreen;

public class MainView extends JPanel {

    MainMenuScreen mainMenu;
    BuildingScreen game;
    HowToPlayScreen howToPlay;
    OptionsScreen options;

    public MainView() throws FontFormatException, IOException {
        setLayout(new CardLayout());
        mainMenu = new MainMenuScreen();
        game = new BuildingScreen();
        howToPlay = new HowToPlayScreen();
        options = new OptionsScreen();

        add(mainMenu, "mainMenu");
        add(game, "game");
        add(howToPlay, "howToPlay");
        add(options, "options");

        mainMenu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainMenu.playButton.getActionCommand().equalsIgnoreCase(e.getActionCommand())) {
                    ((CardLayout) getLayout()).show(MainView.this, "game");
                }

                if(mainMenu.howToPlayButton.getActionCommand().equalsIgnoreCase(e.getActionCommand())) {
                    ((CardLayout) getLayout()).show(MainView.this, "howToPlay");
                }

                if(mainMenu.optionsButton.getActionCommand().equalsIgnoreCase(e.getActionCommand())) {
                    ((CardLayout) getLayout()).show(MainView.this, "options");
                }
            }

        });

    }

}