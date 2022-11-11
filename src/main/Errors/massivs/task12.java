package massivs;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your n - number: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            arr[i] = arr[i]; //saved
        }
        int m = input.nextInt();

        for (int i = 0; i < n; i++) {
            if(arr[i] == m) {
                arr[i] = m;
                System.out.println("Yes [" + i + "]");
            }
            else System.out.println("No");
        }

    }
}
