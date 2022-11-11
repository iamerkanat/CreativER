package massivs;

import java.util.Arrays;
import java.util.Scanner;

public class task8ReversedArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your n:");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[n-1] = inp.nextInt();
            arr[i] = arr[n-1]; //saving
        }


        System.out.println("Array: " +Arrays.toString(arr));

//calling method:
        int[] reversedArray = reverse(arr);
            System.out.println("Reversed: " + Arrays.toString(reversedArray));



    }
        //method:
    static int[] reverse(int[] arr){
        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr.length > i)
            newarr[arr.length - 1 - i] = arr[i];
        }
        return newarr;

    }


 }
