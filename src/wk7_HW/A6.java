package wk7_HW;
/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
| Salary Slip |
| |
| Employee Id : 2564 |
| Employee Name : Jay |
| |
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
| |
| Gross Salary : 26750.0 |
|===========================

 */
public class A6 {
    static double Emp = 2564, B = 25000;
    static String S = "Jay";           //both are static variable

    public static void main(String[] args) {         //Main method
        System.out.println("____________________________________");
        System.out.println("|                                  |");
        System.out.println("|           Salary Slip            |");
        System.out.println("|__________________________________|");
        System.out.println("| Employee Id   :   " +Emp + "         |");
        System.out.println("| Employee Name :   "+S +  "            |");
        System.out.println("|__________________________________|");
        System.out.println("| Basic Salary  :   "+B + "        |");
        System.out.println("| HRA 10%       :   "+(B*10/100) +"         |");
        System.out.println("| TA 8%         :   "+(B*8/100) +"         |");
        System.out.println("| DA 9%         :   "+(B*9/100) +"         |");
        System.out.println("| PF - 20%      :   "+(B*20/100) +"         |");
        System.out.println("| Gross Salary  :   "+(B+(B*10/100)+(B*8/100)+(B*9/100)-(B*20/100))+"        |");
        System.out.println("|__________________________________|");
        System.out.println("|==================================|");

    }
}
