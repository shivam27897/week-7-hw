package wk7_HW;
/*
Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;
public class A14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input value : ");

        char c = sc.next().charAt(0);

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

            System.out.println(c + " is Alphabet");

        } else if(c >= '0' && c <= '∞') {

            System.out.println(c + " is Number");

        } else {

            System.out.println(c + " is Symbol");
        }
    }
}
