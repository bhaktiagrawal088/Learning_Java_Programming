import java.util.*;

public class loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = " ";
        // While loop
        while (name.isBlank()) {
            System.out.print("Enter your Name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello " + name);

        // do while loop
        int i = 0;
        do {
            System.out.println("This is a Do-While Loop");
            System.out.print("Do you want to continue? Y/N : ");
            char ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                System.out.println("Continuing the loop...");
            } else {
                break;
            }
            i++;
        } while (i < 5);
        // For loop
        for (int j = 1; j <= 5; j++) {
            System.out.println(j + " This is a For Loop");
        }

        // nested loop
        System.out.println("\nNested Loops\n");
        for (int k = 1; k <= 3; k++) {
            System.out.print("Outer Loop Iteration " + k + ": ");
            for (int l = 1; l <= 4; l++) {
                System.out.print("Inner Loop Iteration " + l + " ");
            }
            System.out.println();
        }

        // Another Example
        int row, col;
        String symbol;
        System.out.print("Enter number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        col = sc.nextInt();
        System.out.print("Enter symbol: ");
        symbol = sc.next();
        System.out.println("\nSymbol Pattern\n");
        for (int m = 1; m <= row; m++) {
            System.out.println();
            for (int n = m; n <= col; n++) {
                System.out.print(symbol);
            }
        }
        sc.close();
    }
}
