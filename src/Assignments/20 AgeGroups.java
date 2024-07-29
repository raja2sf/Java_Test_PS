package Assignments;

import java.util.Scanner;

class AgeGroups {
public  static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Age: ");
    double input = scan.nextDouble();

    if(input >= 60){
        System.out.println("Senior Citizen");
    } else if (input >= 20) {
System.out.println("Adult");
    } else if (input >= 13){
        System.out.println("Teen");
    } else System.out.println("Child");
}
}
