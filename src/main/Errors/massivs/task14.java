package massivs;

import java.util.Scanner;
//2x2 with X replacement on n<0:
public class task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
                arr[i][j] = arr[i][j];
            }
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) { //<m
            for (int j = 0; j < arr[i].length; j++) { //<n
                if(arr[i][j] < 0) {
                    sum++;
                    System.out.print("X ");
                }
                else if(arr[i][j]>= 0){
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println("");
        }
        System.out.println(sum);
    }
}
