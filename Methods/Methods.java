package Methods;

public class Methods {
    public static void main(String args[]) {
        hello();
        System.out.println("Hello again!");
        int a = 5, b = 6;

        System.out.println(sum(a, b));

        // Create a object
        Methods obj = new Methods();
        // Accessing the method using the object name
        System.out.println(obj.add(b, a, b));
    }

    static void hello() { // use static keyword beacuse we don't want to create a object of class
        System.out.println("Hello World!");
    }

    static int sum(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }
}
