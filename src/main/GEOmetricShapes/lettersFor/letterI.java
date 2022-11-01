package lettersFor;

public class letterI {
    public static void main(String[] args) {
        int n =11, i, j;

        for (i = 1; i <= n; i++) {

            for(j=1; j<=n; j++) {
                if((i == 1 || i ==n) && j==3)
                    for(j=1; j<=n-6; j++)
                        System.out.print("I");
                else if(i<=n && j == n/2)
                    System.out.print("!");
                else System.out.print(" ");


            }


            System.out.println("");
        }
    }
}
/*
  IIIII
    !
    !
    !
    !
    !
    !
    !
    !
    !
  IIIII
 */