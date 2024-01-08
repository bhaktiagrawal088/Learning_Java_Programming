import java.util.*;

public class randomvalue {
    public static void main(String args[]) {
        Random random = new Random();
        System.out.println("Random integer between 1 and 50: ");
        int num = random.nextInt(50) + 1; // nextInt is
        // inclusive of the lower bound, so we add 1 to make it exclusive
        System.out.println(num);
        double dnum = random.nextDouble(); // returns a number between 0.
        // 0 and 1.0 (exclusive of 1.0)
        System.out.println("\nRandom Double value :");
        System.out.println(dnum);
    }
}
