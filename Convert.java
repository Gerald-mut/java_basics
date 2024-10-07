import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degrees in celcius ");
        double degrees = input.nextDouble();

        double farenheit = (9 / 5) * degrees + 32;

        System.out.println(degrees + " is " + farenheit);

    }
}
