package Methods;

public class overloaded {
    public static void main(String args[]) {
        // creating objects of the class "overloaded"
        overloaded obj1 = new overloaded();
        System.out.println("Sum of two numbers : " + obj1.add(3, 4));
        System.out.println("Sum of three numbers : " + obj1.add(4, 6, 9));
        System.out.println("Sum of two double numbers : " + obj1.add(3.5, 6.7));
        System.out.println("Sum of two Strings : " + obj1.add("Bhakti ", "Agrawal"));

    }

    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    double add(double x, double y) {
        return x + y;
    }

    String add(String s1, String s2) {
        return s1 + s2;
    }

}
