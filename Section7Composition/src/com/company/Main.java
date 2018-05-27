package com.company;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor("White", "Smooth", 1);
        Wall wall1 = new Wall("Gray", "Bumpy", 2);
        Wall wall2 = new Wall("Gray", "Bumpy", 0);
        Wall wall3 = new Wall("Gray", "Bumpy", 0);
        Wall wall4 = new Wall("Gray", "Bumpy", 1);

        Room room = new Room(floor, wall1, wall2, wall3, wall4);

        System.out.println(room.floor.getTexture());
        room.floor.setTexture("Striped");
        System.out.println(room.floor.getTexture());

        room.floor.fallThroughTrapdoor();
    }
}
