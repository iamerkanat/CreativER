package Calc;

import java.util.Scanner;
//multiplication without *
public class mulwithoutmul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your 1st number: ");
        int a = input.nextInt();
        System.out.println("Your second number: ");
        int b = input.nextInt();

        int sum = 0;

        for (int i = 0; i < b; i++) {
            sum = sum + a;
        }
        System.out.println("a * b = " + sum);
    }
}
