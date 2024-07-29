package Assignments;

import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter P Value: ");
        float p = scan.nextFloat();
        System.out.println("Enter R Value: ");

        float r = scan.nextFloat();
        System.out.println("Enter T Value: ");

        float t = scan.nextFloat();

        double compoundInterest = p *Math.pow((1+r / 100) ,t);
        System.out.println("Enter Result Value: " + compoundInterest);

    }
}
