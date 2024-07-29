package Assignments;

import java.util.Scanner;

class PerimeterofTriangle {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter A Value: ");
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    double d = scan.nextDouble();
    double perimeter = a + b + c + d;
    System.out.println("Enter Result Value: " + perimeter);

}
}
