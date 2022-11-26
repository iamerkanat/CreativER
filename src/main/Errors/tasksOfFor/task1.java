package tasksOfFor;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println(i +"^2 = "+(i*i));
        }
    }

}
