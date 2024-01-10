
public class arrays {
    public static void main(String args[]) {
        String[] cars = new String[3];
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Mustang";
        // Print out the array of car names
        System.out.println("Here are the cars:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i] + " ");
        }

        // 2D arrays
        int[][] matrix = { { 1, 2 }, { 3, 4 }, { 4, 5, 6 } };
        // print out each row of the matrix
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[j].length; k++) {
                System.out.print(matrix[j][k] + " ");
            }
            System.out.println();
        }
    }
}
