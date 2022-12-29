package wk7_HW;
/*
Write if else condition and print your group name in console else
others group name
 */
public class A4 {
    public static void main(String[] args) {                //main method
        String name = "Restassured", name1 = "Postman" ;       //local variable
        if (name==name1) {                          //if condition true then sysytem will enter the block
            System.out.println(name);
        }
        else {                                  //if condition wrong system will enter this block
            System.out.println(name1);
        }
    }
}