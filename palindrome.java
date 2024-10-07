import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three digit integer: ");

        int number = input.nextInt();

        // Calculate what the first and last number
        int firstNumber = number / 100;
        int lastNumber = number % 10;

        if (firstNumber == lastNumber) {
            System.out.println( number + " is a palindrome");
        }
        else {
            System.out.println( number + " is not a palindrome");
        }
    }
}