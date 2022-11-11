package massivs;

import java.util.Scanner;
//1 line and 2 line, do they have similarities
public class task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your n - number: ");
        int n = input.nextInt();

        int[][] arr = new int[2][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[0][j] == arr[1][j])
                    System.out.print("yes");
                else if (arr[0][j] != arr[1][j])
                    System.out.print("No");
                else System.out.print("");
            }
            System.out.println("");
        }
    }
}
