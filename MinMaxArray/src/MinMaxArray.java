public class MinMaxArray {
    public static void main(String[] args) {
        int [] numbers = {10, 30, 40, 8, 7, 3, 60, 89};
        int maxValue = findMax(numbers);
        int minValue = findMin(numbers);

        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);
    }
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
}