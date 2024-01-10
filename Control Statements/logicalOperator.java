public class logicalOperator {
    public static void main(String args[]) {
        int x = 10;
        int y = 5;
        if (x > y)
            System.out.println("X is greater than Y");
        else
            System.out.println("X is not greater than Y");
        // Logical AND Operator
        if ((x == 10) && (y == 5)) {
            System.out.println("Both conditions are true");
        }
        // Logical OR Operator
        if ((x <= 9) || (y >= 6))
            System.out.println("At least one condition is true");
        /* NOT operator in Java is represented by the keyword '!' */
        if (!(x == 8))
            System.out.println("Value of X is not 8");

    }
}
