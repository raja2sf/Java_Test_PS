package Assignments;

import java.util.Scanner;

class LCM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Enter the First Number:");
        int first = scan.nextInt();
        System.out.println("Enter the Second Number:");
        int second = scan.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM of the Number: " + lcm);

    }

    public static int lcm(int first, int second){
        int i = 1;
       // while (i<= second){
         while (true){
            int factor = first *i;
            if(factor % second == 0){
                return factor;
            }
            i++;

        }
    //    return  0;
    }
}
