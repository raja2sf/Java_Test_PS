package Assignments;

import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Swapping Values ");
        System.out.println("Enter A value : ");
        double a = scan.nextDouble();
        System.out.println("Enter B value : ");
        double b = scan.nextDouble();

        double add = a + b;
        double mul = a * b;
        double sub = a - b;
        double div = a / b;
        double flo = a % b;

        //floating point numbers

        System.out.println("Addition: " + a + b);
        System.out.println("Substraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Flo : " + flo);

    }
}
