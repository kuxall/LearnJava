import java.util.Scanner;

public class ArrayContainsValues{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be searched: ");
        int valueToFind = scanner.nextInt();
        boolean containValue = contains(numbers, valueToFind);

        if (containValue) {
            System.out.println("The number " + valueToFind + " is found in the array");
        } else {
            System.out.println("The number " + valueToFind + " is not found in the array");
        }
    }
    public static boolean contains(int[] array, int value) {
        for (int j : array) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }
}