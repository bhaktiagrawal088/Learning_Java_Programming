import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("poem.txt");
            file.write("Roses are red \n Violets are blue \n ");
            // Add more lines of text here.
            System.out.println("Successfully wrote to the file.");
            file.append("This is append content");
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error writing to the file.");
        }
    }
}
