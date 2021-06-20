package alamsyah.praktikumPBO.pertemuan7.unguided;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnguidedFileNotFoundException {
    public static void main(String args[]) {
        try {
            // Following file does not exist
            File file = new File("D://Praktikum7.pdf");

            // to read data from a file
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            // will be executed if the file does not exist
            System.out.println("File does not exist \n" + e);
        }
    }
}
