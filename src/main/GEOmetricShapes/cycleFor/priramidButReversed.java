package cycleFor;

import java.util.Scanner;

public class priramidButReversed {
    public static void pir(){
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = h - i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i +1 ; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }


    public static void main(String[] args) {
        pir();
    }
}
