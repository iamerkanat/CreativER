package lab2;

public class main {
    public static void main(String[] args) {
        student E = new student(30739, "Erkanat", "Orynbai", 18, 3.1, new String[]{"Math", "Java", "Physics"});

        String[] data = new String[100];
        for (int i = 0; i < data.length; i++) {
            if(i==0){
                data[i] = E.getData();}

            System.out.println(data[i]);
        }


    }

}
