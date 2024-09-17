import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromAFile {
    public static void main(String[] args) {
    try {
        File file = new File("C:\\Users\\acer\\Desktop\\Java\\BasicScannerExample\\src\\demo.txt");
        Scanner filescanner = new Scanner(file);

        while (filescanner.hasNextLine()) {
            String line = filescanner.nextLine();
            System.out.println(line);
        }
    } catch (FileNotFoundException e) {
        System.out.print("File not Found.");
    }
    }
}