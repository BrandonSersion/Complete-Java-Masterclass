package com.company;

public class Main {

    public static void main(String[] args) {

        BetterPlayer player = new BetterPlayer("Tim", 50, "Spear");

        System.out.println(player.getHealth());
        player.loseHealth(20);
        System.out.println(player.getHealth());
        player.loseHealth(30);
        System.out.println(player.getHealth());
        player.loseHealth(57);
        System.out.println(player.getHealth());


//	//no proper encapsulation
//	    Player player = new Player();
//	    // you have access because of public scope
//	    player.name = "Tim";
//	    player.health = 20;
//	    player.weapon = "sword";
//
//	    int damage = 1000;
//	    player.loseHealth(damage);
//	    System.out.println("Remaining health = " + player.healthRemaining());
    }
}
