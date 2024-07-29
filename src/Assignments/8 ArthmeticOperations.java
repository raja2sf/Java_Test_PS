package Assignments;

import java.util.Scanner;

class ArthmeticOperations {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Swapping Values ");
        System.out.println("Enter A value : ");
        int a = scan.nextInt();
        System.out.println("Enter B value : ");
        int b = scan.nextInt();

        int add = a + b;
        int mul = a * b;
        int sub = a - b;
        int div = a / b;
        int flo = a % b;

        System.out.println("Addition: " + add);
        System.out.println("Substraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Flo : " + flo);


    }



    }
