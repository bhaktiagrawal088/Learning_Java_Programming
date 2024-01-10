
public class ifcondition {
    public static void main(String args[]) {
        // if Statement
        int a = 10;
        System.out.println("If statement example:");
        if (a > 5) {
            System.out.println("Value is greater than 5");
        } else {
            System.out.println("Value is not greater than 5");
        }
        // Nested If Statements
        System.out.println("\nNested if statement example : ");
        int x = 5;
        if (x < 10) {
            System.out.print("Value is less than 10");
            if (x == 9) {
                System.out.println(", and value is exactly 9");
            } else {
                System.out.println(", but value is not exactly 9");
            }
        }
        // If...Else If... Else Statement
        System.out.println("\nIf...else if...else statement example : ");
        int b = 7;
        if (b < 5) {
            System.out.println("Value is less than 5");
        } else if (b == 5) {
            System.out.println("Value is equal to 5");
        } else {
            System.out.println("Value is greater than 5");
        }
    }
}
