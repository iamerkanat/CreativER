package cycleFor;

public class XmasTree {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            for (int j = 10-i; j > 0; j --) {
                System.out.print(" ");
            }

            for (int j = 0; j < i*2-1; j++) {
                System.out.print("A");
            }

            System.out.println("");
        }


        for (int i = 1; i <= 10; i++) {

            for (int j = 10-i; j > 0; j --) {
                System.out.print(" ");
            }

            for (int j = 0; j < i*2-1; j++) {
                System.out.print("A");
            }

            System.out.println("");
        }


        for (int i = 1; i<=10; i++){

            for(int j = 0; j <= 7; j++)
                System.out.print(" ");

            for(int z = 0; z<=4; z++)
                System.out.print("X");


            System.out.println("");
        }



    }
}
