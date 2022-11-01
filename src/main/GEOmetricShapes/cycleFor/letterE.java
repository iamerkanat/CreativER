package cycleFor;

import java.util.Scanner;

public class letterE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Could you enter your favourite number: ");
        int n = scan.nextInt();

        //int n =11;
        int i, j;

        for(i = 1; i <= n; i++){

            for (j = 1; j <= n; j++) {
                if(j==1 || j == 2 || i == 1 || i == n || i == n/2+1 && j<=n-1)
                    System.out.print("E");
            }
            System.out.println("");
        }
    }
}


/* 11:
EEEEEEEEEEE
EE
EE
EE
EE
EEEEEEEEEE
EE
EE
EE
EE
EEEEEEEEEEE

Process finished with exit code 0

 */
