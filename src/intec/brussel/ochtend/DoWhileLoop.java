package intec.brussel.ochtend;

public class DoWhileLoop {
    public static void main(String[] args) {

        //Deze zal de tussen {} altijd 1 keer uitvoeren
        //of deze nou true or false is
        //wordt niet altijd gebruikt maar wel handig
        //do {
        // } while (condition)

        int panCakes=0;
        boolean hunger= true;
        do {
            System.out.println("take some flour");
            System.out.println("take a egg");
            System.out.println("take some milk");
            System.out.println("mix it");

            if (panCakes==3){
                hunger = false;
            }

            panCakes++;
            System.out.println("amount of pancakes" + panCakes);


        } while (hunger);
        System.out.println("Great pancakes");

    }
}
