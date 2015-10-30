package pack;
import java.util.Scanner;

public class calc {

    public static void main(String[] args){

        Scanner cs = new Scanner(System.in);
        System.out.println ("Enter first number a=");
        double a = cs.nextDouble();
        System.out.println ("Enter second number b=");
        double b = cs.nextDouble();
        System.out.println("Enter operation");
        String operation = cs.next();

        switch (operation){
            case "+":
                System.out.println ( + (a + b));
                break;

            case "-":
                System.out.println ( + (a - b));
                break;

            case "*":
                System.out.println ( + (a * b));
                break;

            case "/":
                System.out.println ( + (a / b));
                break;

        }
    }

}

