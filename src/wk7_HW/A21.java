package wk7_HW;
/*
 Write a Java program to calculate the average value of array elements.
 */
public class A21 {
    public static void main(String[] args) {
        int[] n = new int[]{1, 3, 8, 9, 2, 4, 7, 13, 5, 6, 10, 16 };
        int sum = 0;
        for(int i=0; i < n.length ; i++)
            sum = sum + n[i];
        double avg = sum / n.length;
        System.out.println("Average value of the array elements is : " + avg);
    }
}