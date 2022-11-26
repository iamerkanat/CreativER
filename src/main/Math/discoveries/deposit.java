package discoveries;

import java.util.Scanner;

public class deposit {
    public static void depp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Your deposit beginning: ");
        double money = input.nextDouble();
        System.out.println("TIME: ");
        int time = input.nextInt();
        final double percent = 0.09;
        double deposit = 0;
        for (int i = 1; i <= time; i++) {
            money = money + money * percent;
            System.out.println("After " + i+" years, your deposit will be: " +money);
        }

    }

    public static void main(String[] args) {
        depp();
        System.out.println("CONGRATULATIONS!");
    }
}
