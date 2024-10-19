import java.util.Arrays;
public class ArrayCopy {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};

        int[] copiedArrayLoop = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArrayLoop[i] = originalArray[i];
        }
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Copied array: " + Arrays.toString(copiedArrayLoop));
    }
}