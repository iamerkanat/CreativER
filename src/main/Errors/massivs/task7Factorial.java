package massivs;

import java.util.Scanner;

public class task7Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your number: ");
        int num = input.nextInt();
        int factorial = 1;

        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            factorial *= num - i;
            System.out.println(factorial);
        }
    }
}
