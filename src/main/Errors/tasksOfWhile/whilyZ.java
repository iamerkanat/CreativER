package tasksOfWhile;

public class whilyZ {

    public static void main(String[] args) {
        int N = 0;
        while(N<=100){
            System.out.print("$");
            N++;
        }
        System.out.println("");
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j <= i ; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j <1; j++)
                System.out.print("Z");

            System.out.println("");
        }

    }


}
