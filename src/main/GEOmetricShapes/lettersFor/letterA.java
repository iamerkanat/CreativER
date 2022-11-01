package lettersFor;

public class letterA {
    public static void main(String[] args) {
        int n = 11;
        int i, j;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++) {
                if (j == 1 || j == 2 || i == 1 || (i == n / 2 + 1 && j <= n - 1))
                    System.out.print("A");


                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
