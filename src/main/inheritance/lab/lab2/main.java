package lab2;

public class main {
    public static void main(String[] args) {
        student E = new student(30739, "Erkanat", "Orynbai", 18, 3.1, new String[]{"Math", "Java", "Physics"});
        student A = new student(30779, "Askar", "Mold", 18, 3.1, new String[]{"Java", "Physics"});
        student B = new student(30939, "Bekarys", "", 18, 2.67, new String[]{"PE", "Politics"});
        student Q = new student(30999, "Qaisar", "Qasym", 18, 2.99, new String[]{"Physics", "Russian"});
        student Z = new student(30777, "Zangar", "Zhunisbek", 18, 2.96, new String[]{"Physics", "Geo" });
        person Kath = new person(1673, "Katherine", "Pierce", 549);
        person Coco = new person(1893, "Gabriel", "Chanel", 82);
        person Beth = new person(1962, "Beth", "Harmone", 30);
        person Grom = new person(1111, "Kirk", "O'Railey", 45);
        person Tom = new person(499666, "Tom", "Harries", 12);
        employee Tori = new employee(20102013, "Victoria", "Justice", 32, 3000000);
        employee Cat = new employee(20102014, "Ariana", "Grande", 32, 100000000);
        employee Jack = new employee(1992022, "Johny", "Depp", 51, 5000000);
        employee Lara = new employee(19902000, "Angelina", "Jolie", 47, 2000000);
        employee Edward = new employee(20082014, "Robert", "Pattinson", 32, 3000000);
        String[] data = new String[100];
        for (int i = 0; i < data.length; i++) {
            if(i==0){
                data[i] = E.getData();
                System.out.println(data[i]);
            }
            switch(i){
                case 1:
                    data[i] = A.getData();
                    System.out.println(data[i]);
                    break;

                case 2:
                    data[i] = B.getData();
                    System.out.println(data[i]);
                    break;
                case 3:
                    data[i] = Q.getData();
                    System.out.println(data[i]);
                    break;
                case 4:
                    data[i] = Z.getData();
                    System.out.println(data[i]);
                    break;
                case 5:
                    data[i] = Coco.getData();
                    System.out.println(data[i]);
                    break;
                case 6:
                    data[i] = Beth.getData();
                    System.out.println(data[i]);
                    break;
                case 7:
                    data[i] = Grom.getData();
                    System.out.println(data[i]);
                    break;
                case 8:
                    data[i] = Tom.getData();
                    System.out.println(data[i]);
                    break;
                case 9:
                    data[i] = Kath.getData();
                    System.out.println(data[i]);
                    break;
                case 10:
                    data[i] = Tori.getData();
                    System.out.println(data[i]);
                    break;
                case 11:
                    data[i] = Cat.getData();
                    System.out.println(data[i]);
                    break;
                case 12:
                    data[i] = Lara.getData();
                    System.out.println(data[i]);
                    break;
                case 13:
                    data[i] = Jack.getData();
                    System.out.println(data[i]);
                    break;
                case 14:
                    data[i] = Edward.getData();
                    System.out.println(data[i]);
                    break;
                default:
                    System.out.println("null");

            }

        }


    }

}
