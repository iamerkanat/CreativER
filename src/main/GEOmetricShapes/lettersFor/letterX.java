package lettersFor;

public class letterX {
    public static void main(String[] args) {
        int n = 13, i , j;

        for(i = 1; i<=n; i++){
            for(j = 1; j<=n; j++){
                if(i == j)
                    System.out.print("X");
                else if (i == n - j + 1) //reversed version of first if statement /
                    System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
