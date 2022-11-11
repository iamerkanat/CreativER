package massivs;

import java.util.Arrays;
import java.util.Scanner;
//min & max by sort(arg)
public class task10v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your n - number: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            arr[i] = arr[i]; //saved
        }
        Arrays.sort(arr); //how it works???
        int max = arr[n-1];
        int min = arr[0];
        System.out.print(Arrays.toString(arr) +"\n");
        System.out.println(max);
        System.out.println(min);
    }
}
