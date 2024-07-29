package Assignments;

import java.util.Scanner;

class GCD {

    public static void main(String[] args) {
        System.out.println("welcome to GCD: Greatest Common Divisor");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int first = scan.nextInt();

        System.out.println("");
        System.out.print("Enter the Second Number: ");
        int second = scan.nextInt();
        System.out.println( );

        int gcd = (first*second) /lcm(first,second) ;
        System.out.println("GCD value:" + gcd);

    }

//    public static int gcd(int first, int second){
//        int lcm = lcm(first,second);
//
//        int gcd = (first*second) /lcm(first,second) ;
//
//        return 0;
//    }


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
