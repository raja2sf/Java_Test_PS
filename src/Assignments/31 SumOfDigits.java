package Assignments;

import java.util.Scanner;

class SumOfDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = scan.nextInt();
        long fact = factorialNumber(num);
        System.out.println("Factorial Number: " + fact);
    }

    public static long factorialNumber(int num){
    int sum = 0;
    while ((num >0)){
        sum += num % 10;
        num /= 10;
    }
        return sum;
    }
}
