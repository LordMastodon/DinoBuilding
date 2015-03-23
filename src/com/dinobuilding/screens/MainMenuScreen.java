package com.dinobuilding.screens;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.JPanel;

import com.dinobuilding.Window;
import com.dinobuilding.menufeatures.MenuButton;
import com.dinobuilding.references.FontConstants;
import com.dinobuilding.references.StringConstants;
import com.dinobuilding.utilities.FontHandler;

@SuppressWarnings("serial")
public class MainMenuScreen extends JPanel {
	
	public MenuButton playButton;
	public MenuButton howToPlayButton;
	public MenuButton optionsButton;
	
	int screenWidth = Window.screenWidth;
	int screenHeight = Window.screenHeight;

    //Width is 1366 pixels
    //Height is 768 pixels
	
	public MainMenuScreen() throws FontFormatException, IOException {
		setLayout(new GroupLayout(this));
		
		howToPlayButton = new MenuButton("How To Play!", "/howToPlayButton", 25, screenHeight / 3 + 75);
		add(howToPlayButton);
		
		optionsButton = new MenuButton("Options!", "/optionsButton", 25, screenHeight / 3 + 200);
		add(optionsButton);
		
		playButton = new MenuButton("Play!", "/mainMenuPlayButton", 25, screenHeight / 3 - 50);
		add(playButton);
	}
	
	public void addActionListener(ActionListener listener) {
        howToPlayButton.addActionListener(listener);
        optionsButton.addActionListener(listener);
        playButton.addActionListener(listener);
    }

    public void removePlayActionListener(ActionListener listener) {
        howToPlayButton.removeActionListener(listener);
        optionsButton.removeActionListener(listener);
        playButton.removeActionListener(listener);
    }
    
    @Override
    public Dimension getPreferredSize() {
    	return new Dimension(Window.screenWidth, Window.screenHeight);
    }
    
    @Override
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
    	g2d.setFont(FontConstants.font.deriveFont(Font.PLAIN, 24));
    	
    	g.drawImage(Window.background.getImage(), 0, 0, Window.screenWidth, Window.screenHeight, Window.observer);
    	
		//int stringWidth = g2d.getFontMetrics(gameFont.deriveFont(Font.PLAIN, 24)).stringWidth("DinoBuilding!");
    	g2d.drawString(StringConstants.dinobuilding, 25, screenHeight / 3 - 130);
        g2d.dispose();
    }
}