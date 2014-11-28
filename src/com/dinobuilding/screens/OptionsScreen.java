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

@SuppressWarnings("serial")
public class OptionsScreen extends JPanel {

	int screenWidth = Window.screenWidth;
	int screenHeight = Window.screenHeight;
	
	public Font gameFont = Font.createFont(Font.TRUETYPE_FONT, new File("resources/font/DinoBuilding.ttf"));
	
	public OptionsScreen() throws FontFormatException, IOException {
		setLayout(new GroupLayout(this));
	}
	
	public void addActionListener(MenuButton b, ActionListener listener) {
        b.addActionListener(listener);
    }

    public void removePlayActionListener(MenuButton b, ActionListener listener) {
        b.removeActionListener(listener);
    }
    
    @Override
    public Dimension getPreferredSize() {
    	return new Dimension(Window.screenWidth, Window.screenHeight);
    }
    	
	@Override
    public void paintComponent(Graphics g) {
		super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
    	g2d.setFont(gameFont.deriveFont(Font.PLAIN, 24));

        g.drawImage(Window.background.getImage(), 0, 0, Window.screenWidth, Window.screenHeight, Window.observer);

        int stringWidth = g2d.getFontMetrics(gameFont.deriveFont(Font.PLAIN, 24)).stringWidth("DinoBuilding!");
    	g2d.drawString("DinoBuilding!", Window.screenWidth / 2 - (stringWidth / 2), Window.screenHeight / 3 - 150 - 20);
        g2d.dispose();
    
	}
}
