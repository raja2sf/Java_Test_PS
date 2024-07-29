package Assignments;

import java.util.Scanner;

class RightShift {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first valve:");

    int first = input.nextInt();

    int result = first >> 1;

    System.out.println("Result: " + result);
}
}
