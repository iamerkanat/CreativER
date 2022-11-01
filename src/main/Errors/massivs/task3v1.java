package massivs;

public class task3v1 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4, 5},
                {4, 9, 1, 3, 0},
                {2, 6, 4, 1, 9},
                {5, 7, 8, 0, 2}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
    }
}
