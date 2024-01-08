import java.util.Scanner;

public class UserInput {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name dear ?");
        String userName = scanner.nextLine(); // Reads the entire line of text until
        System.out.println("How old are you dear ?");
        int age = scanner.nextInt(); // Reads the next integer
        scanner.nextLine(); // Reads the next String || Prevent the error
        System.out.println("What is you Favourite Food ?");
        String food = scanner.nextLine(); // Reads the entire line of text until a
        System.out.println("Hello " + userName);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favourite food is " + food + ".");
        scanner.close();
    }
}
