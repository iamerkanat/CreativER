package lab2;

import java.util.Scanner;

public class student extends person {
    Scanner in = new Scanner(System.in);
    double gpa;
    String[] subjects = {"math", "english", "physics", "Java"};

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public student(int id, String name, String surname, int age, double gpa, String[] subjects ){
        super(id, name, surname, age);
        this.gpa = gpa;
        this.subjects = subjects;
    }

    @Override
    public String getData() {
        return super.getData();
    }
}
