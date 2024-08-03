package Assignments;

import java.util.Scanner;

class ArrayDeletingASpecificElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcom to ArrayDeletingSpecificElement:");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the element to delete in array");
        int numToDelete = scan.nextInt();
        int[] newArr = arrayDeletingSpecificationElement(numArr, numToDelete);
        System.out.print("Here is your new Array");
        ArrayUtility.displayArray(newArr);
    }

        public static int[] arrayDeletingSpecificationElement(int[] numArr, int numToDelete ){
             int occ = OccuranceArray.noOfOccurances(numArr, numToDelete);
             if(occ == 0){
                 return numArr;
             }
             int newSize = numArr.length - occ;
             int[] newArr = new int[newSize];
             int i = 0, j = 0;
            while (i < numArr.length) {

                if(numArr[i] != numToDelete){
                    newArr[j] = numArr[i];
                    j++;
                }
                i++;
            }
            return newArr;
        }



}
