package Assignments;

import java.util.Scanner;

class BitwiseOR {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();

        System.out.println(first | second);
    }
}
