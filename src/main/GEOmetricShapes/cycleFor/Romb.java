package cycleFor;

public class Romb {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){

            for (int j = 10; j > i ; j--)
                System.out.print(" ");

            for (int k = 1; k<=(i*2)-1; k++)
                System.out.print("R");

            System.out.println("");
        }
        for(int i=1; i<=10; i++){

            for(int j = 1; j<=i; j++)
                System.out.print(" ");

            for (int k = (10-i)*2 - 1; k>=1; k--)
                System.out.print("R");

            System.out.println("");
        }
    }
}



/*
         R
        RRR
       RRRRR
      RRRRRRR
     RRRRRRRRR
    RRRRRRRRRRR
   RRRRRRRRRRRRR
  RRRRRRRRRRRRRRR
 RRRRRRRRRRRRRRRRR
RRRRRRRRRRRRRRRRRRR
 RRRRRRRRRRRRRRRRR
  RRRRRRRRRRRRRRR
   RRRRRRRRRRRRR
    RRRRRRRRRRR
     RRRRRRRRR
      RRRRRRR
       RRRRR
        RRR
         R
 */
