package Assignments;

class ArrayPalindrome {

    public static void main(String[] args) {

        System.out.println("welcome to palindrome");
        int[] numArr = ArrayUtility.inputArray();
        boolean palindrome  = aPalindrome(numArr);
        if (palindrome){
            System.out.println("Given Array is palindrome");
        }
        else {
            System.out.println("Given Array is not palindrome");
        }
    }

    public static boolean aPalindrome(int[] numArr){
        int i = 0;
        while (i < numArr.length / 2){
            if (numArr[i] != numArr[numArr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
