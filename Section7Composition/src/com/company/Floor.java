package com.company;

public class Floor {
    private String color;
    private String texture;
    private int trapdoors;

    public Floor(String color, String texture, int trapdoors) {
        this.color = color;
        this.texture = texture;
        this.trapdoors = trapdoors;
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

    public int getTrapdoors() {
        return trapdoors;
    }

    public void setTrapdoors(int trapdoors) {
        this.trapdoors = trapdoors;
    }

    public void fallThroughTrapdoor(){
        System.out.println("Whoosh");
    }
}
