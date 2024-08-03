package Assignments;

import java.util.Scanner;

class OccuranceArray {

    public static void main(String[] args) {


        System.out.println("Welcome to Occurance:");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number:");

        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now Enter to find the Number Array:");
        int num = scan.nextInt();
        int occurances = noOfOccurances(numArr, num);
        System.out.println("no of Occurences" + occurances + "numbers");

    }

    public static int noOfOccurances(int[] numArray, int num) {
        int occurances = 0;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occurances++;
            }
            i++;

        }
        return occurances;
    }
}
