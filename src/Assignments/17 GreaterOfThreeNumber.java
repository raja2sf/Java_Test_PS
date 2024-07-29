package Assignments;

import java.util.Scanner;

class GreaterOfThreeNumber {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Value: ");
        int first = scan.nextInt();
        System.out.println("Enter the Second Value: ");
        int second = scan.nextInt();
        System.out.println("Enter the Third Value: ");
        int third = scan.nextInt();

        if( first >= second && first >= third){
            System.out.println("First Valuse is Greatest");
        } else if (second >= third && second >= first ) {
            System.out.println("Second Value is Greatest");
        }else {
            System.out.println("Third Value is Greatest");
        }
    }
}
