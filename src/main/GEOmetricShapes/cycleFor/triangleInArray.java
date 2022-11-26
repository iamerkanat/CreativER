package cycleFor;

import java.util.Scanner;

public class triangleInArray {
    public static void triangle(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char arr[][] = new char[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = '*';
                System.out.print(arr[i][j] +" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        triangle();
    }
}
