package tasksOfWhile;

import java.util.Scanner;

public class no5Quad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int quad = 1;
        int i = 0;
        while(i<n){
            quad = i * i;
            System.out.println(i + "^2 = " + quad);
            i++;
        }
    }



}
