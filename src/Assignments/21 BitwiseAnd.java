package Assignments;

import java.util.Scanner;

class BitwiseAnd {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Value:");

        int a = input.nextInt();
        System.out.println("Enter B Value: ");
        int b = input.nextInt();
//        if(a > b){
//            System.out.println("A is Higher:" + a);
//        }else
        System.out.println(a & b);
    }

}
