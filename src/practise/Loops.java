package practise;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
//        int num =1; // initialization
//        while(num <=100000){  //condition
//            System.out.println(num);  //actual work
//           // num = num+1; //updating the condition
//            num ++;
//        }
//
//        int num = 0;
//        while(num <= 0){
//            System.out.println(num);
//            //num = num -1;
//            num -=1;
//        }
//
//        int count = 500;
//        while (count >= 400){
//            System.out.println(count);
//            count = count -1;
//
//        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i < 6){
            int inp = input.nextInt();
            System.out.println("Number : " + inp);
            i++;
        }
    }
}
