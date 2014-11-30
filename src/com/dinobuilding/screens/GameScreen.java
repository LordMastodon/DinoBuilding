package com.dinobuilding.screens;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

import com.dinobuilding.Window;
import com.dinobuilding.utilities.RenderManagerForGameScreen;

@SuppressWarnings("serial")
public class GameScreen extends JPanel {
	
	private volatile boolean running = true;

    public GameScreen() {
    	
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                while (running) {

                    repaint();

                    if (running) {
                        try {
                            Thread.sleep(40);
                        } catch (InterruptedException ex) {
                        }
                    }
                }
            }
        });

        t.start();

    }

    public void stop() {

        if (running) {

            running = false;

        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        for(int i = 0; i < RenderManagerForGameScreen.objectsToRender.length; i++) {
            g2d.drawImage(RenderManagerForGameScreen.objectsToRender[i].getDisplayImage().getImage(), RenderManagerForGameScreen.objectsToRender[i].getX(), RenderManagerForGameScreen.objectsToRender[i].getY(), Window.observer);
        }

        g2d.dispose();
    }
    
    @Override
    public Dimension getPreferredSize() {
    	return new Dimension(Window.screenWidth, Window.screenHeight);
    }

}
