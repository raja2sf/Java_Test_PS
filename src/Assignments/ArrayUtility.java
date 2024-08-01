package Assignments;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Numbers:");
        int input    = scanner.nextInt();
        int[] num = new int[input];
        int i = 0;
        while (i < input) {
            System.out.println("enter the num:" + (i+1)+ ":");
            num[i] = scanner.nextInt();
            i++;
        }
        return num;
    }
}
