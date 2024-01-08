public class expression {
    public static void main(String args[]) {
        int x = 10;
        System.out.println("Value of x is " + x);
        // Arithmetic Operators
        System.out.println("Addition : " + (x + 5));
        System.out.println("Subtraction : " + (x - 5));
        System.out.println("Multiplication : " + (x * 5));
        System.out.println("Division : " + (x / 5));
        System.out.println("Modulus : " + (x % 5));
        // Increment and Decrement operators
        System.out.println("\nIncrement x by 1 using ++");
        x++;
        System.out.println("New value of x is " + x);
        System.out.println("\nDecrement x by 1 using --");
        x--;
        System.out.println("New value of x is " + x);
        // Relational Operators
        System.out.println("\nChecking relational operators: ");
        if (x < 10) {
            System.out.println("x is less than 10");
        } else {
            System.out.println("x is not less than 10");
        }

    }
}
