package Assignments;

import java.util.Scanner;

class Grading {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value:");
        int input = scan.nextInt();

        if( input >= 90){
            System.out.println("A Greade");
        } else if (input >= 75) {
            System.out.println("B Grade");
        }else if (input >= 60){
            System.out.println(" C Grade");
        } else if (input >= 30) {
            System.out.println("D Grade");
        }else System.out.println("All The Best Next Time");
    }
}
