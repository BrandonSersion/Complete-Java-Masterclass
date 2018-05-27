package com.company;

public class Wall {
    private String color;
    private String texture;
    private int windows;

    public Wall(String color, String texture, int windows) {
        this.color = color;
        this.texture = texture;
        this.windows = windows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
}
