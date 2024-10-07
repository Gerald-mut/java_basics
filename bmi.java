import java.awt.im.InputContext;
import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms and height in metres");
        double weight = input.nextDouble();
        double height = input.nextDouble();

        double bmi =  weight / (height * height);

        System.out.println("Your BMI is " + bmi);
    }
}
