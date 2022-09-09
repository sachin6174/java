import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {

        File myFile = new File("created.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}