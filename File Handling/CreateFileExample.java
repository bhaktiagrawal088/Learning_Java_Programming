import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        String path = "C:/Users/Bhakti Agrawal/Desktop/LPU/Java/File Handling/bhakti.txt";
        File newfile = new File(path);
        try {
            if (newfile.createNewFile()) {
                System.out.println("Directory already exists" + path);
            } else {
                System.out.println("Creating directory......." + path);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error in creating the file : " + e);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error in getting the file name : " + e);
        }

    }
}
