package massivs;

import java.util.Scanner;

public class task7massivVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fac = 1;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n -i;
            fac = fac * arr[i];
        }
        System.out.println(fac);
    }
}
