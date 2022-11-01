package lettersFor;

public class letterZ {
    public static void main(String[] args) {
        int n =13, i , j;

        for(i = 1; i <= n; i++){
            for(j = 1; j <=n; j++){
                if((i==1 || i==n) && j<=n){
                    System.out.print("Z");
                }
                else if(i==n - j + 1) //tricky i==j but reversed
                    System.out.print("X");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

/*
ZZZZZZZZZZZZZ
           X
          X
         X
        X
       X
      X
     X
    X
   X
  X
 X
ZZZZZZZZZZZZZ
 */