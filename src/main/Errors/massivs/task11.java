package massivs;

import java.util.Scanner;
//sum without min and max
public class task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your n - number: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        int max = arr[0];
        int min = arr[0];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            //arr[i] = arr[i]; //saved
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min || arr[i] == arr[0])
                min = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] != max && arr[i] != min)
                sum = sum + arr[i];
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);


    }
}
