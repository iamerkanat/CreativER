package massivs;

import java.util.Arrays;
import java.util.Scanner;
//finding sum and arifmetic average of array
public class task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your n - number: ");
        int n = input.nextInt();
        int sum = 0;

        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            arr[i] = arr[i];
            if(i<n) //just for fun
                sum = sum + arr[i];
        }
        System.out.print("Your array: " + Arrays.toString(arr) +"\n");
        System.out.println(sum);
        System.out.println(sum/n);


    }
}
