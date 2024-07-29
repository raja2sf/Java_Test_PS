package Assignments;

import java.util.Scanner;

class LeftShift {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int result = first << 1;

        System.out.println(result);
    }
}
