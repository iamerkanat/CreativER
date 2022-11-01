package massivs;
//вывести числа от 0 до 100 в массиве!
public class task1 {
    public static void main(String[] args) {
        int n = 100;
        int arr[] = new int[n]; // 100 элементов в массиве arr[]
        String[] E = new String[10];
        E[0] = "Erkanat";
        E[1] = "EREN";
        for (int i = 0; i < n; i++) { //цикл повторяет до n = 100
            arr[i] = i; //arr[0] = 0; arr[1] = 1; arr[2] = 2; arr[3] = 3 and etc.
            //System.out.println(arr[i]) выведет 0...100
            if(i<=10)
                System.out.println(arr[i] + ". " + E[0]);
            else if(i>10 && i<=20)
                System.out.println(arr[i] + ". " + E[1]);
            else System.out.println(arr[i] + " " + E[2]);
        }
    }
}
