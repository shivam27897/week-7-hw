package wk7_HW;
/*
Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;
public class A7 {
    public static void main(String[] args)          //Main method
    {
        Scanner Sc = new Scanner(System.in);        //created object
        System.out.print("Input number: ");
        int n = Sc.nextInt();                      //loacl variable
        if(n % 2 == 0)                            //input number is 'divisible with 2' condition
            System.out.println(n + " is even");
        else                                      //if not then only system enter this block
            System.out.println(n + " is odd");
    }
}
