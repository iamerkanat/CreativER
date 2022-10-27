package tasksOfWhile;

import java.util.Scanner;

public class whily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = 0;
        while (i<=N) {
            System.out.println(i + " = " + "100 - " + (N-i));
            i++;
        }



    }
}
