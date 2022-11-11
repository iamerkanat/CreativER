package massivs;

import java.util.Arrays;
import java.util.Scanner;

public class task10mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            arr[i] = arr[i];
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min || arr[i] == arr[0])
                min = arr[i];
        }



        System.out.println(Arrays.toString(arr) + "\n");
        System.out.println(min);
        System.out.println(max);
    }
}
