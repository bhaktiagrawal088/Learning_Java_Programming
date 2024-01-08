import java.util.*;

public class Maths {
    public static void main(String args[]) {
        int x = 9;
        int y = 25;
        System.out.println("Value of x is : " + x);
        System.out.println("Value of y is : " + y);
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int absolute = Math.abs(x);
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
        System.out.println("The Absolute Value is " + absolute);

        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x");
        a = scanner.nextDouble();
        System.out.println("Enter the value of y");
        b = scanner.nextDouble();
        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Length of hypotenuse is " + c);
        scanner.close();

    }
}
