package wk7_HW;

import sun.text.resources.cldr.zh.FormatData_zh_Hans_SG;

/*
Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class A5 {
    static String name = "Jay", Subject = "Marks";
    static int RollNo = 8, Maths = 98, Science = 90, English = 85, Total = Maths + Science + English;
    static double Per = (Total*100/300);        //Declared all static variable

    public static void main(String[] args) {        //Main method
        System.out.println("____________________________________");
        System.out.println("|                                  |");
        System.out.println("|            Mark Sheet            |");
        System.out.println("|__________________________________|");
        System.out.println("|      Name       :    " + name + "         |");     // calling all declared static variable in class
        System.out.println("|      Roll No.   :    " + RollNo + "           |"); //       into main method directly
        System.out.println("|----------------------------------|");
        System.out.println("|      Subjects   :    " + "Marks" + "       |");
        System.out.println("|----------------------------------|");
        if (Maths <= 100 && Maths >= 0) {                           //if condition true system will enter the block
            System.out.println("|      Maths      :    " + Maths + "          |");
        } else {
            System.out.println("Invalid Input");                   //if condition wrong then only system enter this block
        }
        if (Science <= 100 && Science >= 0) {
            System.out.println("|      Science    :    " + Science + "          |");
        } else {
            System.out.println("Invalid Input");
        }
        if (English <= 100 && English >= 0) {
            System.out.println("|      English    :    " + English + "          |");  //using concatinaton to add multiple sting using'+'
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("|----------------------------------|");
        System.out.println("|      Total      :    " + Total +"         |");
        System.out.println("|----------------------------------|");
        System.out.println("|      Percentage :    " + Per + " %      |");
        if (Per >= 35) {
            System.out.println("|      Result     :    PASS        |");
        } else {
            System.out.println("|      Result     :    FAIL        |");
        }
        if (Per >= 80) {
            System.out.println("|      Grade      :    A+          |");
        } else if (Per <= 80 && Per >= 60) {
            System.out.println("|      Grade      :    A           |");
        } else if (Per <= 60 && Per >= 50) {
            System.out.println("|      Grade      :    B           |");
        } else if (Per <= 50 && Per >= 35) {
            System.out.println("|      Grade      :    C           |");
        } else {
            System.out.println("Fail");
        }
        System.out.println("|----------------------------------|");
    }
}