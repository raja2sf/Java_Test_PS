package Assignments;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Numbers:");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("enter the num:  " + (i+1)+ ":  ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] num){
        int i = 0;
        while (i <= num.length){
            System.out.print(num[i] + i);
            i++;
        }
    }


}
