package wk7_HW;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
import java.util.Scanner;
public class A9 {
    public static void main(String[] args)                   //Main method
    {
        Scanner s = new Scanner(System.in);               //created object
        System.out.println("Enter sales ID :");
        int id = s.nextInt();                            //user will enter the value of variable
        System.out.println("Enter name :");
        String name = s.next();
        System.out.println("Enter sales amount :");
        int sale = s.nextInt();
        System.out.println("Enter basic salary :");
        int bas = s.nextInt();
        int com = 0;
        System.out.println("commision = ");
        if (sale>=50000){                              //using nested if else method
            System.out.println(com=sale*35/100);
        } else if (sale<50000 && sale>=30000) {
            System.out.println(com=sale*20/100);
        } else if (sale<30000 && sale>=20000) {
            System.out.println(com=sale*10/100);
        }
        else if (sale>=20000 && sale<10000) {
            System.out.println(com=sale*5/100);
        }
        else if (sale<10000) {
            System.out.println(com=sale*2/100);
        }

        System.out.println("Total Earning = " +(com+bas));

    }
}