package massivs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task16MulTable {
    public static void array(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[][] arr = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                arr[i][j] = i * j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        array();
    }


}
