package Assignments;

import java.util.Scanner;

class BitwiseODDEVEN {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();

        if((num & 1) == 0){
            System.out.println("Even");
        }else
        System.out.println("ODD");
    }
}
