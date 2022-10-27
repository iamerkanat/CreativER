package tasksOfWhile;

import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        while(N>0){
            System.out.print(N +"\n");
            --N;
        }
    }
}
