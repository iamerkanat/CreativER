package massivs;

import java.util.Scanner;

public class task6myVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your  number, plz: ");
        int n = input.nextInt(); //row
        System.out.println("Your power - number: ");
        int p = input.nextInt(); //column

        int arr[][] = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                if(j == 0)
                    arr[i][j] = i + 1;
                else arr[i][j] = arr[i][j-1] * arr[i][0];

                //if(arr[i][j] == arr[n-1][p-1])
                    System.out.print(arr[i][j] + " ");
            }


        }
    }
}

/*
when: n = 5; p = 3;
1 1 1 1
2 4 8 16
3 9 27 81
4 16 64 256
5 25 125 625
 */