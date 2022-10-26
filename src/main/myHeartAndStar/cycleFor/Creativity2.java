package cycleFor;

public class Creativity2 { //heart
    public static void main(String[] args) {
        int a = 5, b = 9, p;

        for (int i = 1; i <= 10 ; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("A");
            } //triangle with A

            for (int j = (10-i)*2; j >= 0; j--) {
                System.out.print(" ");} //rotated triangle but x2
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("A");} //triangle with A again



            System.out.println("");

        }
        for (int i = 1; i <= 20 ; i++) {

            for (int j = 0; j <= i-2; j++) {
                System.out.print(" ");
            }

            for(int k = (20-i)*2; k>=0; k--){
                System.out.print("V");}



            System.out.println("");

        }


        for (int i =1; i<=1 ; i++){
            System.out.println("Made by EREN");
        }
    }
}





/*
         A                   A
        AAA                 AAA
       AAAAA               AAAAA
      AAAAAAA             AAAAAAA
     AAAAAAAAA           AAAAAAAAA
    AAAAAAAAAAA         AAAAAAAAAAA
   AAAAAAAAAAAAA       AAAAAAAAAAAAA
  AAAAAAAAAAAAAAA     AAAAAAAAAAAAAAA
 AAAAAAAAAAAAAAAAA   AAAAAAAAAAAAAAAAA
AAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAA
VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
 VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
  VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
    VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
     VVVVVVVVVVVVVVVVVVVVVVVVVVVVV
      VVVVVVVVVVVVVVVVVVVVVVVVVVV
       VVVVVVVVVVVVVVVVVVVVVVVVV
        VVVVVVVVVVVVVVVVVVVVVVV
         VVVVVVVVVVVVVVVVVVVVV
          VVVVVVVVVVVVVVVVVVV
           VVVVVVVVVVVVVVVVV
            VVVVVVVVVVVVVVV
             VVVVVVVVVVVVV
              VVVVVVVVVVV
               VVVVVVVVV
                VVVVVVV
                 VVVVV
                  VVV
                   V
Made by EREN

 */