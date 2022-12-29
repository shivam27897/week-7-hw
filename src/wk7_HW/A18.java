package wk7_HW;
/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”

 */
import java.util.Scanner;
public class A18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = s.nextInt();                      //loacl variable
        if(n==0)  {                          //input number is divisible with 2 condition
            System.out.println(n + " is ZERO");}
        else if(n>0)  {                                   //if not then condition
            System.out.println(n + " is POSITIVE");}
        else if(n<0){
            System.out.println(n + "is NEGATIVE");}
         //   else{
         //   }
    }
}

