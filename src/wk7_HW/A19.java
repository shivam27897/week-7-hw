package wk7_HW;
/*
Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;
public class A19 {
        public static void main(String[] args){

            int[] i = {
                    1, 3, 8, 9,
                    2, 4, 7, 13,
                    5, 6,
                    10, 15 };

            String[] Name = {
                    "RestAsuured",  "Postman",

                    "Selenium",
                    "Java",
                    "Jira",
                    "Intellij"};

            System.out.println("Sorted Numbers : "+Arrays.toString(i));

            System.out.println("Sorted String : "+Arrays.toString(Name));
        }
}