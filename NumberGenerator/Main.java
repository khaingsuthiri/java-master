import java.util.Scanner;

public class Main {

    private static int[] getInputNumbers(Scanner scanner) {
        int[] inputNumbers;

        do {
            System.out.print("Enter the integers (space-separated): ");
            String input = scanner.nextLine();

            String[] numbers = input.trim().split("\\s+");

            if (numbers.length < 2) {
                System.out.println("Invalid input. Please enter at least two numbers.");
                continue;
            }

            try {
                inputNumbers = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    inputNumbers[i] = Integer.parseInt(numbers[i]);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
            }
        } while (true);

        return inputNumbers;
    }

    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("Welcome to number sequence generating program");
        System.out.println("**********************************************");
        System.out.println("This program can generate four types of integer sequences based on your input numbers.");
        System.out.println("- Arithmetic Sequence");
        System.out.println("- Geometric Sequence");
        System.out.println("- Power Sequence");
        System.out.println("- Fibonacci Sequence");

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int[] inputNumbers = getInputNumbers(scanner);
            int[] results = null;

            if (SequenceAnalyzer.isArithmetic(inputNumbers)) {
                System.out.println("Your input sequence is an arithmetic sequence.");
                results = SequenceGenerator.generateArithmeticSequence(inputNumbers);
            } else if (SequenceAnalyzer.isPower(inputNumbers)) {
                System.out.println("Your input sequence is a power sequence.");
                results = SequenceGenerator.generatePowerSequence(inputNumbers);
            } else if (SequenceAnalyzer.isGeometric(inputNumbers)) {
                System.out.println("Your input sequence is a geometric sequence.");
                results = SequenceGenerator.generateGeometricSequence(inputNumbers);
            } else if (SequenceAnalyzer.isFibonacci(inputNumbers)) {
                System.out.println("Your input sequence is a fibonacci sequence.");
                results = SequenceGenerator.generateFibonacciSequence(inputNumbers);
            } else {
                System.out.println("Sorry, your input sequence can't be generated any sequence.");
            }

            if (results != null) {
                System.out.print("Result: ");
                for (int i = 0; i < results.length; i++) {
                    System.out.print(results[i] + " ");
                }
                System.out.println();
            }

            System.out.println("Do you want to generate the sequence again? (yes/no)");
            input = scanner.nextLine();

        } while (input.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Thank you for using the program.");
    }
}
