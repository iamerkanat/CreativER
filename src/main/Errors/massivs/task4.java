package massivs;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
            /*Scanner scan = new Scanner(System.in);
            System.out.println("Your n-number: ");
            int n = scan.nextInt();
            System.out.println("Your m-number: ");
            int m = scan.nextInt();*/

        int arr[][] = new int[][]
        {
            {4, 9, 2, 7, 9},
            {6, 1, 3, 0, 3},
            {4, 2, 7, 5, 7}
        };
        for (int i = 0; i < arr.length; i++) { //3
            for (int j = 0; j < arr[i].length; j++) { //5
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println("");
        }

    }
}
