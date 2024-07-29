package Assignments;

import java.util.Scanner;

class SumAllOddNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = scanner.nextInt();

        int sum = oddSum(num);
        System.out.println("The Odd Number 1 to " + num + "is : " + sum);
    }

    public static int oddSum(int num){
        int sum =0;
        int i=1;
        while ( i<= num){
            sum += i;
            i +=2;
        }
        return sum;
    }
}
