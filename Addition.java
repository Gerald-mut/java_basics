import java.util.Random;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int correctCount = 0;
        int totalQuestions = 10;
        long startTime = System.currentTimeMillis();

        System.out.println("Welcome to the Addition Quiz " + totalQuestions + " questions.");

        for (int i = 0; i < totalQuestions; i++) {
            // Generate two random integers between 1 and 15
            int num1 = random.nextInt(15) + 1; // 1 to 15
            int num2 = random.nextInt(15) + 1; // 1 to 15

            // Calculate the correct answer
            int correctAnswer = num1 + num2;

            // Prompt the user for their answer
            System.out.print("Question " + (i + 1) + ": What is " + num1 + " + " + num2 + "? ");
            int userAnswer = scanner.nextInt();

            // Check if the answer is correct
            if (userAnswer == correctAnswer) {
                correctCount++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer is " + correctAnswer + ".");
            }
        }

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime; // in milliseconds

        // Display results
        System.out.println("\nQuiz Complete!");
        System.out.println("You answered " + correctCount + " out of " + totalQuestions + " questions correctly.");
        System.out.printf("Time taken: %.2f seconds\n", timeTaken / 1000.0);

        scanner.close();
    }
}
