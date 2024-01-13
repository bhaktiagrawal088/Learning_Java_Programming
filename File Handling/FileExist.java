import java.io.File;

public class FileExist {
    public static void main(String[] args) {
        File file = new File("text.txt");
        if (file.exists()) {
            System.out.println("The file name is :  " + file.getPath());
            System.out.println("The file path is : " + file.getAbsolutePath());
            System.out.println("Is this is a file :" + file.isFile());
            file.delete();
        } else {
            System.out.println("File does not exist.");
        }

    }
}