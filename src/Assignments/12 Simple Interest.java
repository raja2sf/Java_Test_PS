package Assignments;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Value: ");
        float a = scan.nextFloat();
        System.out.println("Enter B Value: ");

        float b = scan.nextFloat();
        System.out.println("Enter C Value: ");

        float c = scan.nextFloat();

        float simpleInterest = (a * b * c) / 100;
        System.out.println("Enter Result Value: " + simpleInterest);

    }

}
