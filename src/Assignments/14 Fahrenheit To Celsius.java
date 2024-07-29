package Assignments;

import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter f Value: ");
        float f = scan.nextFloat();

        float cell = (f - 32) * 5 / 9;

        System.out.println("Enter Result Value: " + cell);

    }
}
