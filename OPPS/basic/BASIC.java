
public class BASIC {
    public static void main(String args[]) {
        car mycar = new car();
        car mycar2 = new car();
        System.out.println("Make: " + mycar.make);
        System.out.println("Model: " + mycar.model);
        System.out.println("Year: " + mycar.year);
        System.out.println("Color: " + mycar.color);
        mycar.drive();
        mycar.brake();
        mycar2.drive();
        mycar2.brake();
    }
}
