package Assignments;

import java.util.Scanner;

class BitwiseComplement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int result = ~first;
        System.out.println(result);
    }

}
