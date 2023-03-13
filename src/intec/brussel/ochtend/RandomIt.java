package intec.brussel.ochtend;

import java.util.Random;

public class RandomIt {
    public static void main(String[] args) {

        //Random

        Random random= new Random();

        //Dan is de range de grote van de datatype
        System.out.println(random.nextInt());


        //range gaat van 0 tot 9
        System.out.println(random.nextInt(10));


        //range gaat van 5 tot 15
        System.out.println(random.nextInt(10) +5);






    }
}
