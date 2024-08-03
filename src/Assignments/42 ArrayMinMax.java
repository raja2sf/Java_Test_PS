package Assignments;

import java.util.Scanner;

class ArrayMinMax {
    public static void main(String[] args) {
        System.out.println("Welcome to ArrayMaxMin");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Enter the Array Min Max Number");
        int arrayMin = arrayMin(numArray);
        int arrayMax = arrayMax(numArray);
        System.out.println("Min:  " + arrayMin + "Max: " + arrayMax);
        //System.out.println("Max: " + arrayMax);
    }

    public static int arrayMin(int[] numArray){
        int arrayMin = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length){
            if(arrayMin > numArray[i]){
                arrayMin = numArray[i];
            }
            i++;
        }
        return arrayMin;

    }

    public static int arrayMax(int[] numArray){

if(numArray.length == 0){
    return Integer.MIN_VALUE;
}
int arrayMax = numArray[0];
int i = 1;
while (i< numArray.length){
    if(arrayMax < numArray[i]){
        arrayMax = numArray[i];
    }
    i++;
}
        return arrayMax;
    }
}
