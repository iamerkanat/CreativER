package massivs;

import java.util.Scanner;
//from 1 to 10
public class task5v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your n-number: ");
        int n = scan.nextInt();

        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;

            System.out.printf("%d ", arr[i]);
        }
    }
}
