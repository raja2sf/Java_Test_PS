package Assignments;

import java.util.Scanner;

class FactorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = scan.nextInt();
        long fact = factorialNumber(num);
        System.out.println("Factorial Number: " + fact);
    }

    public static long factorialNumber(int num){
        if(num<2){
            return  1;

        }
        long fact = 1;
        int i = 2;

        while ((i<=num)){
            fact *= i;
            i++;
        }
        return fact;
    }
}
