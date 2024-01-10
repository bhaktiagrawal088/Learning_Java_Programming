
public class switchcase {
    public static void main(String args[]) {
        // Switch case
        int x = 20;
        System.out.println("Value of x is " + x);
        /*
         * The switch statement compares the value of x with each case label expression
         * until it
         * finds a match or reaches the end of the switch block. If there's a match
         * between x and one of the case labels, then statements that follow the
         * matching
         * case label are executed.
         */
        switch (x) {
            case 10:
                System.out.print("x is 10");
                break;
            case 20:
                System.out.println("x is 20");
                System.out.print("and fall through to case 30");
                // In this example, if x was equal to 20, the output would be "
                // Value of x is 20x is 10 and fall through to case
            case 30:
                System.out.print("x is 30");
        }
        System.out.println("\n\nSwitch without a break statement");

        String day = "Monday";
        switch (day) {
            case "Sunday":
                System.out.println("Today is Sunday!");
                break;
            case "Monday":
                System.out.println("Today is Monday!");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday!");
            default:
                System.out.println("I don't know what day it is.");

        }
    }
}
