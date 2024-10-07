import java.util.Scanner;

public class algebra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values a, b and c");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double rOne = (-b + Math.sqrt(discriminant)) / (2 * a);
            double rTwo = (-b + Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The equation has two roots " + rOne + rTwo);
        }

        else if (discriminant == 0) {
            double rOne = -b / (2 * a);
            System.out.println("The equation has one real root " + rOne);
        }
        
        else {
            System.out.println("The equation has no real roots ");
        }

    }
}
