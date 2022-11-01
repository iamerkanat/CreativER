package lettersFor;

public class letterD {
    public static void main(String[] args) {
        int n = 11;
        int i, j;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++) {
                if(i <= n)
                    if((i==1 || i == n) && j <= n-5)
                    System.out.print("D");
                else if(i<=n-1 && j == 1)
                    System.out.print("Z");
                else if((i == 2 || i==n-1) && j == n -4 )
                    System.out.print("G");
                else if(i>= 3 && i<=n-2 && j == n - 3)
                    System.out.print("P");
                else
                    System.out.print(" ");

            }
            System.out.println("");
        }
    }
}

/*
DDDDDD
Z     G
Z      P
Z      P
Z      P
Z      P
Z      P
Z      P
Z      P
Z     G
DDDDDD

 */
