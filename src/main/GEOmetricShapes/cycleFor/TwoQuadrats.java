package cycleFor;

public class TwoQuadrats {
    public static void main(String[] args) {
        int e = 4;

        for(int i =0; i<e*2-2; i++){
//spaces
            if(i>=e )
                for (int j = 0; j<e/2; j++)

                    System.out.print("  ");

            //exeptions:
            if(i==2 || i==3)
                for(int w = 2; w>=1; w--)
                    System.out.print("* ");

//the REAL LOOP of *
            for(int j = 0; j<e; j++)

                System.out.print("* ");

            System.out.println("");
        }
    }
}
