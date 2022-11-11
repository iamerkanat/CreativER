package massivs;

import java.util.Arrays;
import java.util.Scanner;
//min & max by .stream(item)
public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your n - number: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            arr[i] = arr[i]; //saved
        }
        int min = Arrays.stream(arr)
                .min()
                .getAsInt();
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.print(Arrays.toString(arr) +"\n");
        System.out.println(max);
        System.out.println(min);


    }
}
