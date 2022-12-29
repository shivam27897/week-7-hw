package wk7_HW;
/*
Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else
 */
import java.util.Scanner;
public class A12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Operator");
        char operator = s.nextLine().charAt(0);
        System.out.println("Enter first Input");
        int a = s.nextInt();
        System.out.println("Enter second Input");
        int b = s.nextInt();
        if (operator == '+')
        {
            System.out.println("Addition is : " +(a+b));
        }
        else if (operator == '-')
        {
            System.out.println("Subtraction is : " +(a-b));
        }
        else if (operator == '*')
        {
            System.out.println("Multiplication is : " +(a*b));
        }
        else if (operator == '/')
        {
            System.out.println("Division is : " +(a/b));
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}