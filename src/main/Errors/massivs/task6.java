package massivs;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your m-number: ");
        int m = scan.nextInt(); //число под степенью

        System.out.println("Your n-number: ");
        int n = scan.nextInt(); //число в степени.


        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0)
                    arr[i][j] = i+1;
                else arr[i][j] = arr[i][j-1] * arr[i][0];
                System.out.print(arr[i][j]+" ");
            }
        }


            System.out.println("");
    }
}
