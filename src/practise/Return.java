package practise;

import java.util.Scanner;

public class Return {
    public static void main(String[] args){
        greet();
//int sum = cal();
        int first = cal() + 2;
        int second = cal() + 5;

        int sum = first + second;
System.out.println("Result: " + sum);

    }

    public static void greet(){
        System.out.println("welcom to calc");
    }
    public static int cal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
//        int first = scan.nextInt();
//        System.out.println(" enter the Second num: ");
//        int second= scan.nextInt();
//        int sum = first + second;
        int number = scan.nextInt();
        return number;

    }

}
