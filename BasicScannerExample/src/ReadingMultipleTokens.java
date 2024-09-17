import java.util.Scanner;

public class ReadingMultipleTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text with multiple words : \t");

        String sentence = scanner.nextLine();
        Scanner wordScanner = new Scanner(sentence);
        while (wordScanner.hasNext()){
            System.out.println("Word: " + wordScanner.next());
        }
    }
}