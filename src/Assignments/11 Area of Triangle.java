package Assignments;

import java.util.Scanner;

class AreaofTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Value: ");
        double a = scan.nextDouble();
        System.out.println("Enter B Value: ");

        double b = scan.nextDouble();

        double areaOfTriangle = 0.5 * a * b;
        System.out.println("Enter Result Value: " + areaOfTriangle);

    }
}
