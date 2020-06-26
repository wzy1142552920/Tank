package com.luckydog.tank;

import java.awt.*;

public class Bullet {
    private static final int SPEED = 1;
    public static final int WIDTH = 30;
    public static final int HEIGHT = 30;
    private boolean live = true;

    private int x, y;
    private Dir dir;
    private TankFrame tf;

    public Bullet(int x, int y, Dir dir, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public void paint(Graphics g) {
        if (!live) {
            tf.bullets.remove(this);
        }
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(c);
        move();
    }

    private void move() {
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            default:
                break;
        }
        if (x<0 || y<0 || x>TankFrame.GAME_HEIGHT || y>TankFrame.GAME_HEIGHT) {
            live = false;
        }
    }
}
