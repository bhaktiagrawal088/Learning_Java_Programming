package Methods;

public class PrintF {
    public static void main(String args[]) {
        int myint = 33;
        float myfloat = 23.4f;
        char mychar = 'A';
        String mystring = "Hello World!";
        System.out.printf("The value of an integer is %d\n", myint);
        System.out.printf("The value of a float is %.1f\n", myfloat);
        System.out.printf("The character represented by the variable mychar is '%c'\n", mychar);
        System.out.printf("The string stored in the variable mystring is \"%s\n", mystring);

        // width
        System.out.printf("Minimum number of character to be written as a output:  %20s ", mystring);

        // Set the digits of precision
        double dval = 56789.1234567;
        System.out.println("\nNumber of digit after decimal point : ");
        System.out.printf("%.1f, %.2f, %.3f, %.4f", dval, dval, dval, dval);

        // flags
        long lval = 12345678901234L;
        System.out.printf("\nInteger in Hexadecimal : %020x \t", lval);
    }
}
