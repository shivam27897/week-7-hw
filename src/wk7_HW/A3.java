package wk7_HW;
/*
Declare multidimensional array and store 5 countries and their
capital and print them in console.
 */
public class A3 {
    public static void main(String[] args) {                //main method
        String [][] S = {   {"India","United Kingdom", "United States",   "Canada",   "Australia"},
                          {"New Delhi",  "London",     "Washington, D.C.", "Ottawa",   "Canberra"}};
                            // declared Multidimensional Array
        System.out.println("1. Country : "+S[0][0] +  " & the Capital is " +S[1][0]);  //calling data from its index number
        System.out.println("2. Country : "+S[0][1] +  " & the Capital is " +S[1][1]);
        System.out.println("3. Country : "+S[0][2] +  " & the Capital is " +S[1][2]);
        System.out.println("4. Country : "+S[0][3] +  " & the Capital is " +S[1][3]);
        System.out.println("5. Country : "+S[0][4] +  " & the Capital is " +S[1][4]);
    }
}