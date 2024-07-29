package Assignments;

import java.util.Scanner;

class BitwiseXor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();

        System.out.println(first ^ second);
    }
}
