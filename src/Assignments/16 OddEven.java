package Assignments;

import java.util.Scanner;

class ODDEVEN {

    public static void main(String[] args){

        System.out.print("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if( input % 2 == 0){
            System.out.println("Even");
        }else System.out.println("Odd");
    }
}
