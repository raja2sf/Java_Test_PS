package Assignments;

import java.util.Scanner;

class SwapNumber {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Swapping Values ");
        System.out.println("Enter A value : ");
        int a = scan.nextInt();
        System.out.println("Enter B value : ");
        int b = scan.nextInt();

        int c =a;
        a = b;
        b = c;
        System.out.println("Swapping Data ");
        System.out.println("value of A : " + a);
        System.out.println("value of B: " + b);



    }
}
