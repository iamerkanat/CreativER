package Errors;

public class Error1 {
    public Error1(){
        System.out.println("Your number is: ");
    }
    protected int x = 42;
}

class B extends Error1{
    public B(){

        System.out.println(x);
    }
}

class Program{
    public static void main(String[] args) {
        B obj = new B();

    }
}

