public class Swap {
    public static void main(String args[]) {
        int x = 10;
        int y = 5;
        System.out.println("Before swapping: x is " + x);
        System.out.println("Before swapping: y is " + y);
        // Swapping the values of x and y using a third variable z
        int z = x;
        x = y;
        y = z;
        System.out.println("\nAfter swapping: x is " + x);
        System.out.println("After swapping: y is " + y);
    }
}
