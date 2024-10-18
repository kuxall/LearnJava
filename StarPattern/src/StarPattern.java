//@Author: Kushal Raj Sharma
//@ID: C0940005
public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // The maximum width of stars (topmost and bottommost part)

        // Upper part of the pattern
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // Print leading spaces
            }
            for (int k = 0; k < n - 2 * i; k++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }

        // Lower part of the pattern
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // Print leading spaces
            }
            for (int k = 0; k < n - 2 * i; k++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }
    }
}
