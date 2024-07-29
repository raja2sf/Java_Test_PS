package Assignments;

import java.util.Optional;
import java.util.Scanner;

class LeapYear {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome the New Year");
        System.out.println("Enter the Year");
        int year = scan.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Your Year is Leap Year");
        } else {
System.out.println("Your Year is not a  Leap Year");
        } //else  System.out.println("Your Year is not a Leap Year");
    }
}
