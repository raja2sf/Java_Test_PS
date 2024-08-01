package Assignments;

import java.util.Scanner;

class ArraySumAverage {

    public static void main(String[] args) {
        System.out.println("Welcome to AverageSum ");

        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double average = average(numArray);

        System.out.println("Sum of the Elements:" + sum);
        System.out.println("average of the Elements:" + average);

    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;

        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray) {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}
