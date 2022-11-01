package lettersFor;

public class letterH {
    public static void main(String[] args) {
        int n = 11, i , j;

        for(i = 1; i<=n; i++){
            for(j = 1; j <= n; j++){
                if(i<=n && j ==1)
                    System.out.print("H");
                else if(i==n/2 && j<=n-1)
                    System.out.print("H");
                else if(i<=n && j==n)
                    System.out.print("H");
                else System.out.print(" ");
            }





            System.out.println("");
        }
    }
}

/*
H         H
H         H
H         H
H         H
HHHHHHHHHHH
H         H
H         H
H         H
H         H
H         H
H         H
 */