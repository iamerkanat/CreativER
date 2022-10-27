package tasksOfWhile;

import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your K value: ");
        int Kvalue = scan.nextInt();
        System.out.println("Enter your N value: ");
        int Nvalue = scan.nextInt();

        while(Kvalue<Nvalue){
            System.out.println(Kvalue);
            Kvalue++;
        }
    }
}
