package cycleFor;

public class letterB {
    public static void main(String[] args) {
        int n =11;
        int i, j;

        for(i = 1; i <= n; i++){

            for (j = 1; j <= n; j++) {
                if(j==1 || j == 2 || i == 1 || i == n || (i == n/2+1 && j<=n-1))
                    System.out.print("B");

                else if(i!=1 && i!=n && j==n)
                    System.out.print("B");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

/*
BBBBBBBBBBB
BB        B
BB        B
BB        B
BB        B
BBBBBBBBBBB
BB        B
BB        B
BB        B
BB        B
BBBBBBBBBBB

Process finished with exit code 0

 */