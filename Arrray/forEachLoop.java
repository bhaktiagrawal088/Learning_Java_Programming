import java.util.*;

public class forEachLoop {
    public static void main(String args[]) {
        String[] animal = { "Cat", "Dog", "Rat", "Bird" };
        System.out.println("Using a For Each Loop:");
        // Using the enhanced "For Each" loop to iterate through an array of animals
        for (String name : animal) {
            System.out.print(name + ", "); // Print each element followed by a comma
        }

        // array list
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Doe");
        names.add("Jane Smith");
        names.add("Alice Johnson");
        System.out.println("\n\nIterating over an Arraylist using a For Each Loop:");
        for (String i : names) {
            System.out.println(i); // print each item in the list
        }

    }
}
