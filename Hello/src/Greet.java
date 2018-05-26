public class Greet {

    public static void main(String[] args){
        short nice = 15_000;
        short fsa = 50;
        fsa *= 2;
        System.out.println(nice + fsa);

        boolean isAlien = true;
        if (isAlien){
            System.out.println("Yes " + isAlien);
        }
        else{
            System.out.println("No " + isAlien);
        }

        boolean wasCar = isAlien ? false : true;
        System.out.println(wasCar);
    }
}
