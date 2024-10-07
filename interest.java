import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your monthly savings amount");

        double savings = input.nextDouble();
        double firstMonth = savings * (1 + 0.00417);
        double secondMonth = (savings + firstMonth) * (1 + 0.00417);
        double thirdMonth = (savings + secondMonth) * (1 + 0.00417);
        double fourthMonth = (savings + thirdMonth) * (1 + 0.00417);
        double fifthMonth = (savings + fourthMonth) * (1 + 0.00417);
        double sixthMonth = (savings + fifthMonth) * (1 + 0.00417);

        System.out.println("Your savings for thew sixth month is " + sixthMonth);
    }
}
