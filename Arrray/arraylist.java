import java.util.*;

public class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // create an empty ArrayList of Integers called
        // "list"
        System.out.println("ArrayList before adding elements: " + list);
        /* Adding elements to the ArrayList using add() method */
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("\nArrayList after adding 3 integers: " + list);
        /* Removing element from the ArrayList using remove() method */
        list.remove(1);
        System.out.println("\nArrayList after removing second integer (index 1):" + list
                + "\nThe removed element is :" + 20);
        /* Checking whether a specific number is present in the ArrayList or not */
        if (list.contains(5))
            System.out.println("\nYes, the ArrayList contains the number 5.");
        else
            System.out.println("No, the ArrayList does not contain the number 5.");
        int index = list.indexOf(30);
        System.out.println("\nThe first occurrence of the number 30 is at position:" + index + "\n");
        /* Displaying all the elements of the ArrayList using for each loop */
        System.out.print("Elements of the ArrayList are : ");
        for (int i : list)
            System.out.print(i + " ");
        /*
         * Duplicating the ArrayList and displaying both original and duplicate
         * ArrayLists
         */
        ArrayList<Integer> dup_list = new ArrayList<Integer>(list);// creates a new
        // ArrayList "dup_list" which is a duplicate of the ArrayList "list".
        System.out.println("\nOriginal ArrayList : " + list);
        System.out.println("Duplicate ArrayList : " + dup_list);

        // clear list
        list.clear();
        System.out.println("\nAfter Clearing the ArrayList : " + list);

        // 2D ArrayList
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        ArrayList<Integer> subList1 = new ArrayList<>();
        ArrayList<Integer> subList2 = new ArrayList<>();
        subList1.add(4);
        subList1.add(7);
        subList2.add(9);
        subList2.add(11);
        arrList.add(subList1);
        arrList.add(subList2);
        System.out.println("2D ArrayList : " + arrList);
        System.out.println("Particular List  : " + arrList.get(1));
        System.out.println("Particular Element: " + arrList.get(1).get(0));

    }
}
