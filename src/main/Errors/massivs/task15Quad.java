package massivs;

import java.util.Scanner;

//quadratic value of each element in array
public class task15Quad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i * i;
            System.out.println(i +"^2 = " + arr[i]);
        }
    }
}
