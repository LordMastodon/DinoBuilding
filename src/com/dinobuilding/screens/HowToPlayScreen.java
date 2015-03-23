package com.dinobuilding.screens;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;

import com.dinobuilding.Window;
import com.dinobuilding.utilities.FontHandler;

@SuppressWarnings("serial")
public class HowToPlayScreen extends JPanel {
	
	public HowToPlayScreen() throws IOException, FontFormatException {
	}
	
	public Font gameFont = FontHandler.getFont();
//	
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
//    
//    @Override
//    public Dimension getPreferredSize() {
//    	return Toolkit.getDefaultToolkit().getScreenSize();
//    }

}
