package lettersFor;

public class letterC {
    public static void main(String[] args) {
        int n = 11;
        int i, j;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++) {
                if (j == 1 || j == 2 || i == 1 || (i == n ))
                    System.out.print("C");


                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
