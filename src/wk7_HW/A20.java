package wk7_HW;
/*
Write a Java program to sum values of an array
 */
public class A20 {
    public static void main(String[] args) {
        int[] n = {1, 3, 8, 9, 2, 4, 7, 13, 5, 6, 10, 15 };
        int sum = 0;
        for (int i : n )
            sum += i;
        System.out.println("The sum is " + sum);
    }
}