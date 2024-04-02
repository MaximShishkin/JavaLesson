package ru.shishkin.maxim.breakout;

import javax.swing.ImageIcon;

public class Brick extends Sprite {
    private boolean destroyed;

    public Brick(int x, int y) {
        initBrick(x, y);
    }

    private void initBrick(int x, int y) {
        this.x = x;
        this.y = y;

        destroyed = false;

        loadImage();
        getImageDimensions();
    }

    private void loadImage() {
        image = new ImageIcon(getClass().getClassLoader().getResource("brick.png")).getImage();
    }

    boolean isDestroyed() {
        return destroyed;
    }

    void setDestroyed(boolean val) {
        destroyed = val;
    }
}