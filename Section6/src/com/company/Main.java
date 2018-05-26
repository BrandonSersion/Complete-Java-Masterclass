package com.company;

public class Main {

    public static void main(String[] args) {

        doStuff("Whoo boy", 5);
        testFor();
        testDoWhile();
    }

    public static void doStuff(String what, int iterations) {
        for (int i = 0; i < iterations; i++) {
            System.out.println(what);
        }
    }

    public static void testFor() {
        for (int i = 0; i < 6; i++) {
            System.out.println(i + " Woo");
        }
    }

    public static void testDoWhile() {
        do {
            System.out.println("Wee");
        } while (false);
    }
}
