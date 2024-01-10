
public class wrapperclasses {
    public static void main(String args[]) {

        // wrappper class --> provides a way that we use the primitive datatypes as
        // reeference datatypes
        // reference datatypes contains useful methods
        // can be used with the collection(ex.ArrayList)

        // primitive // wrapper
        // ......... //.........
        // boolean // Boolean
        // char // Character
        // int // Integer
        // double // DOuble

        // Autoboxing And Unboxing
        /*
         * When we assign value of a primitive data type to an object of its respective
         * wrapper class
         * then it is called autoboxing and when we retrieve the value from the object
         * of
         * wrapper class back to the primitive data type, it is known as unboxing.
         */
        int primitiveaInt = 42;
        char primitiveChar = 'A';

        Integer wrapperInt = Integer.valueOf(primitiveaInt);
        Character wrapperCharacter = Character.valueOf(primitiveChar);

        int retrieveInt = wrapperInt.intValue();
        char retrieveChar = wrapperCharacter.charValue();

        System.out.println("Primtive int : " + primitiveaInt);
        System.out.println("Wrapper Class int: " + wrapperInt);
        System.out.println("Retrieved Int Value: " + retrieveInt);

        System.out.println("Primitive char : " + primitiveChar);
        System.out.println("Wrapper Class Char: " + wrapperCharacter);
        System.out.println("Retrieved Char Value: " + retrieveChar);

    }
}