package wk7_HW;
/*
Same as above program-8 using switch statement.
 */
public class A11 {
    public static void main(String[] args) {
        String name = "A";

        switch (name) {
            case "A":
                for (int i = 10; i < 20; i++) {
                    System.out.println("CodeBuster ");
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}