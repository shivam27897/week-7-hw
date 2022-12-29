package wk7_HW;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
import java.util.Scanner;
public class A10 {
    public static void main(String[] args) {
        String A = "Adelaide", B = "Berlin", C = "Chicago", D = "Dubai", E = "Edinburgh", F = "Florence";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter alphabet :");
        char i = s.nextLine().charAt(0);
        if (i == 'A') {
            System.out.println(A);
        } else if (i == 'B') {
            System.out.println(B);
        } else if (i == 'C') {
            System.out.println(C);
        } else if (i == 'D') {
            System.out.println(D);
        } else if (i == 'E') {
            System.out.println(E);
        } else if (i == 'F') {
            System.out.println(F);
        } else {
            System.out.println("Invalid Entry");
        }
    }
}