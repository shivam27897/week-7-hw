package wk7_HW;
/*
1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */

public class A1 {
    public static void main(String[] args) {      //Main method
        int n =20;                                            //local variable
        String result = n%2==0 ? "Even" : "Odd";   //ternary operator to check number

        System.out.println(n +" is "+ result +" Number");

    }

}