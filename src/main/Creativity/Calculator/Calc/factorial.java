package Calc;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Your number for factoring : ");
        int number = scan.nextInt();


        int factor = 1;
        for(int i = 0; i< number; i++){
            factor *= (number - i);

        }
            System.out.println("will be: " + factor);

            /*
            HOW IT REALLY WORKS?

            5! =
            f(0) = 1 * (5 - 0) = 5;
            f(1) = f(0) * (5 - 1) = 5 * 4 = 20;
            f(2) = 20 * (5 - 2) = 60;
            f(3) = 60 * (5 - 3) = 120;
            f(4) = 120 * (5 -4 ) = 120;
            f(4) is last because for(i=0; i<5; i++) [0;5);
             */



    }
}
