package massivs;
import java.util.Arrays;
import java.util.Scanner;

public class task8MyVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your n:");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[n-1] =input.nextInt();
            arr[i] = arr[n-1];
        }
        int[] reversedArray = reverse(arr);
        System.out.println(Arrays.toString(reversedArray));

    }

    static int[] reverse(int[] arr){
        int[] arrr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr.length > i)
                arrr[arr.length - i -1] = arr[i];
        }
        return arrr;
    }
}
