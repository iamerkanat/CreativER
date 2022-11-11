package massivs;

import java.util.Scanner;

public class task7iw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fac = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            fac = (n - i) * fac; // fac = (7 - 0) * 1// fac = (7 - 1) * 7 // fac = (7-2) * (7-1)*7
        }
        System.out.print(fac+" ");
    }
}
