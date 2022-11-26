package tasksOfWhile;

import java.util.Scanner;

public class no6Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        while(true){
            int a = input.nextInt();
            if(a == 0)
                break;
            sum +=a;
            amount++;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Amount: "+ amount);
        System.out.println("average: " + (double)sum/amount);
    }
}
