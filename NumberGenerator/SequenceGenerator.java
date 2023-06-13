import java.util.Arrays;

public class SequenceGenerator {

    private static final int COUNT_TO_GENERATE = 10;

    public static int[] generateArithmeticSequence(int[] numbers) {
        int[] results = new int[COUNT_TO_GENERATE];
        int lastNumber = numbers[numbers.length - 1];
        int commonDifference = numbers[1] - numbers[0];

        for (int i = 0; i < COUNT_TO_GENERATE; i++) {
            results[i] = lastNumber + (i + 1) * commonDifference;
        }
        return results;
    }

    public static int[] generateGeometricSequence(int[] numbers) {
        int[] results = new int[COUNT_TO_GENERATE];
        double commonRatio = (double) numbers[1] / numbers[0];
        int lastNumber = numbers[numbers.length - 1];

        for (int i = 0; i < COUNT_TO_GENERATE; i++) {
            results[i] = lastNumber * (int) (commonRatio);
            lastNumber = results[i];
        }
        return results;
    }

    public static int[] generatePowerSequence(int[] numbers) {
        int[] results = new int[COUNT_TO_GENERATE];
        int base = numbers[0];
        int length = numbers.length;

        for (int i = 0; i < COUNT_TO_GENERATE; i++) {
            results[i] = (int) Math.pow(base, length + 1);
            length++;
        }
        return results;
    }

    public static int[] generateFibonacciSequence(int[] numbers) {
        int[] results = new int[COUNT_TO_GENERATE];
        int length = numbers.length;

        for (int i = 0; i < COUNT_TO_GENERATE; i++) {
            int nextNumber = numbers[length - 1] + numbers[length - 2];
            results[i] = nextNumber;
            numbers = Arrays.copyOf(numbers, length + 1);
            numbers[length] = nextNumber;
            length++;
        }
        return results;
    }
}
