
public class finalKeyword {
    public static void main(String[] args) {
        // Final keyword
        /*
         * The final keyword is used in Java to declare a variable that cannot be
         * changed after initialization.
         * // It is used to make a variable unchangeable after initialization.
         */
        int x = 10;
        System.out.println("Before modification: " + x);
        x = 11;
        System.out.println("After modification: " + x);
        // Making 'x' as final
        final int y = 20;
        // y = 10; ---> can't change the value of final keyword
        System.out.println("\nValue of y :" + y);

    }
}