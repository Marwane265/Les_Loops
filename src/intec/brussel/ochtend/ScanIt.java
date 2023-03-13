package intec.brussel.ochtend;

import java.util.Scanner;

public class ScanIt {
    public static void main(String[] args) {

        //Scanner class moeten we impoorteren

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scanner.nextLine();

        System.out.println("Enter your age:  ");
        int age= scanner.nextInt();
//De \n combi zorgt ervoor dat hij op een nieuwe regel staat
        System.out.println("Name:  " + name.toUpperCase() + "\n Age:  "
                + age);






    }
}
