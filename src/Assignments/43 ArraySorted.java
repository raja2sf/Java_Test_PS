package Assignments;

class ArraySortedCheckList {

    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorted List");
        int[] arrayNum = ArrayUtility.inputArray();
        boolean inC = inCreasingSorted(arrayNum);
        boolean dec = decreasingSorted(arrayNum);
        if(inC || dec){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }

    }

    public static  boolean inCreasingSorted(int[] arrayNum){
        int i = 1;
        while (i < arrayNum.length){
            if(arrayNum[i] <  arrayNum[i-1]){
                return false;
            }
            i++;
        }

        return true;
    }



    public static boolean decreasingSorted(int[] arrayNum){
        int i = 1;
        while (i < arrayNum.length){
            if(arrayNum[i] >= arrayNum[i-1]){
                return false;
            }
            i++;
        }

        return true;
    }

}
