package practise;

import java.util.Scanner;

public class Function {
public static void main(String[] args){
  //  System.out.println("1");

//    int a = firstPattern();
//    int b = firstPattern();
//    int cal = a +b;
//    System.out.println("Cal : " + cal);
/*    greeting();
    System.out.println("last");*/
        firstPattern();
}
//
//public static void greeting(){
//    System.out.println("GM Test Coding");
//
//}

/*
public static int firstPattern(){

/*    int  rows =0;
    while(rows < 5){
    System.out.print("*");
    int i = 0;
    while(i < rows) {
        System.out.print(" *");
    i++;
    }
    System.out.println( );
    rows++;
    }

    Scanner input = new Scanner(System.in);
    System.out.println("Make a Num : ");
    int num = input.nextInt();
    return num;
}

*/

 public static void firstPattern(){
     int rows = 0;
     while(rows <5){
         System.out.print("*");
        int i = 0;
        while(i < rows){
            System.out.print("  *");
            i++;
        }
         System.out.println( );
         rows++;
     }
 }
}
