package massivs;

import java.util.Scanner;
//from 10 to zero (reversed version of task3)
public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your n-number: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
            System.out.printf("%d ", arr[i]);
        }
    }
}
