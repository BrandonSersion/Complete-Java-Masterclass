package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 20;
        testVariable(myVariable);
        System.out.println(testBoolean());
    }

    public static void testVariable(int ourVariable) {

        ourVariable++;
        ourVariable++;

        System.out.println(ourVariable);
        System.out.println("Who" + "Goes" + "There");
    }

    public static boolean testBoolean() {

        if (true) {
            return true;
        }
        return false;
    }

}
