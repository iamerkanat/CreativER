package cycleFor;

public class notMultiplyJustPlus {

    public static void main(String[] args) {

        int result = 0;
        for(int i = 1; i<=5; i++) {
            for(int j = 1; j<=4; j++)
                result++; // 1 + 1 + 1 +1 and again 4 times. After that, 1+1+1+1 + (1+1+1+1) * 4 times = 20
        }
        System.out.println(result);
    }

}
