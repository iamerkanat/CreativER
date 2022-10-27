package tasksOfWhile;

public class number4 {
    public static void main(String[] args) {
        int a = 15;
        int b = 6;

        int temp = a;
        while(temp>=0){
            temp = temp - b;
        }
        System.out.println(temp + b);
    }
}
