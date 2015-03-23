package com.dinobuilding.screens;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

import com.dinobuilding.Window;
import com.dinobuilding.utilities.RenderManagerForGameScreen;

@SuppressWarnings("serial")
public class BuildingScreen extends JPanel {
	
	private volatile boolean running = true;

    public BuildingScreen() {
    	
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                while (running) {
                    repaint();
                    try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                }
            }
        });
        t.start();
    }

    public void stop() {
            running = false;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        for(int i = 0; i < RenderManagerForGameScreen.objectsToRender.size(); i++) {
            g2d.drawImage(RenderManagerForGameScreen.objectsToRender.get(i).getDisplayImage().getImage(), RenderManagerForGameScreen.objectsToRender.get(i).getX(), RenderManagerForGameScreen.objectsToRender.get(i).getY(), Window.observer);
        }

        g2d.dispose();
    }
    
    @Override
    public Dimension getPreferredSize() {
    	return new Dimension(Window.screenWidth, Window.screenHeight);
    }

}
