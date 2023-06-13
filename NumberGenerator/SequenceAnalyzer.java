public class SequenceAnalyzer {

    public static boolean isArithmetic(int[] numbers) {
        int commonDifference = numbers[1] - numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - numbers[i - 1] != commonDifference) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGeometric(int[] numbers) {
        double commonRatio = (double) numbers[1] / numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if ((double) numbers[i] / numbers[i - 1] != commonRatio) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPower(int[] numbers) {
        int base = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != Math.pow(base, i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFibonacci(int[] numbers) {
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1] + numbers[i - 2]) {
                return false;
            }
        }
        return true;
    }
}
