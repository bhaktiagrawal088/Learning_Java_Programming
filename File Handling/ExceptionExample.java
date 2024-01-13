import java.util.*;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter a number to divide : ");
            int num1 = s.nextInt();
            System.out.println("Enter the divisor:");
            int div = s.nextInt();
            System.out.println("Result : " + num1 / div);
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error! One or more format arguments are missing in the print statement");
        } finally {
            System.out.println("This block will always execute whether an exception occurs or not");
            s.close();
        }
    }
}
