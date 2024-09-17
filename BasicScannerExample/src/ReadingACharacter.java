import java.util.Scanner;

public class ReadingACharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string but it should show the character only: \t");

        char character = scanner.nextLine().charAt(0);
        System.out.print("You entered this: \t" + character);

    }
}
