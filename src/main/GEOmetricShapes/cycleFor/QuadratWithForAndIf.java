package cycleFor;

public class QuadratWithForAndIf {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //5
            for (int j = 0; j < 5; j++) { //5X5
                if(j<=4 || i<=4){
                    System.out.print("H ");
                } else if(i>1 || j>1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println("");
        }
    }
}
