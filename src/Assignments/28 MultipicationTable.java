package Assignments;

import java.util.Scanner;

class MultipicationTable {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter the Valve:");
        int vaule = input.nextInt();
        printMultiplicationTable(vaule);
    }
    public static void printMultiplicationTable(int value){
        int i = 1;
        while (i<=10){
            System.out.println(value + " X " + i + " = " + (value*i));
        i++;
        }
    }
}
