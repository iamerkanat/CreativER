package cycleFor;

public class massivs {
    public static void main(String[] args) {
        int []arr={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for(int z=0; z<1; z++){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * arr[i];
                System.out.print(i + "^2 = "+arr[i] + " ");
            }

            for(int k = 0; k < 1; k++)
                System.out.println(" ");

            for (int j =0; j < arr.length; j++){
                arr[j] = (arr[j] * arr[j]);
                System.out.print(j + "^4 = "+arr[j] + " ");
            }



        System.out.println(" ");}
    }
}
