package Assignments;

import java.util.Scanner;

class NumberPositiveNegativeZero {
    public static void main(String[] args){

        System.out.println("Enter the Number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if( input >= 0){
            System.out.println("Positive");
        }else System.out.println("Negative");
    }
}
