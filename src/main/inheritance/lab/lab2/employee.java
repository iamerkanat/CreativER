package lab2;

public class employee extends person {
    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public employee(int id, String name, String surname, int age, double salary){
        super(id, name, surname, age);
        this.salary = salary;
    }


}
