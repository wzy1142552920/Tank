package com.luckydog.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(800, 600);//set the window size
        f.setResizable(false);//change the window size
        f.setTitle("Tank War");
        f.setVisible(true);//set the window visible

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //listen the event, when click the exit "X"
                System.exit(0);
            }
        });
    }
}
