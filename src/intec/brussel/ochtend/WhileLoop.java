package intec.brussel.ochtend;

public class WhileLoop {
    public static void main(String[] args) {

        //while loop heeft geen index
        //while loop die functioneert op een boolean
        //while loop wordt meestal als we het eindpunt niet weten
        //while(conditie => true of false) {}

//        int counter=0;
//        while (counter<10){
//            System.out.println(counter);
////Je moet de counter incrementeren anders blijft de condition altijd true. -> infinitie loop
//            counter++;
//        }

        boolean isAlive= true;
        int index = 0;
        while(isAlive){
            if (index==3){
                isAlive=false;
                System.out.println("nope, not anymore");
            }
            System.out.println("still alive");
            index++;
        }



    }
}
