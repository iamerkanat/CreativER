package Calc;

import java.util.Scanner;


public class CalculatorReal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner mab = new Scanner(System.in);

        System.out.println("First number: ");
        double firstNum = scan.nextDouble();

        System.out.println("WHAT TO DO?");
        String operation = mab.next();

        System.out.println("Second number: ");
        double secondNum = scan.nextDouble();


        if(operation.equals("*")){
            double mul = firstNum * secondNum;
            System.out.println("will be: "+ mul);
        }


        if(operation.equals( "/")){
            double dev = firstNum / secondNum;
            System.out.println("will be: "+ dev);
        }

        if(operation.equals("%")){
            double remain = firstNum % secondNum;
            if(remain==1)
                System.out.println("there is only: "+ (int)remain + " remain");
            System.out.println("there are : "+ (int)remain + " remains" );
        }

        if(operation.equals("!")){
            int factor = 1;
            for(int i = 0; i< (int)firstNum + (int)secondNum; i++){
                factor *= ((firstNum + secondNum) - i);
            }
            System.out.println("("+firstNum + " + " + secondNum + ") != " + factor);

        }

        if(operation.equals("-")){
            double minus = firstNum - secondNum;
            System.out.println(firstNum + " - " + secondNum + " = " + minus);
        }

        if (operation.equals("+")) {
            double plus = firstNum + secondNum;
            System.out.println(firstNum + " + " + secondNum + " = " + (int)plus);
        }

    }

}

