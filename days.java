import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter todays day: ");
        int day = input.nextInt();
        String dayString = null;
        String daysAfterString = null;

        System.out.println("Enter the number of days elapsed since today: ");
        int days_after = input.nextInt();

        switch (day) {
            case 0: dayString = "Sunday"; break;
            case 1: dayString = "Monday"; break;
            case 2: dayString = "Tuesday"; break;
            case 3: dayString = "Wednesday"; break;
            case 4: dayString = "Thursday"; break;
            case 5: dayString = "Friday"; break;
            case 6: dayString = "Saturday"; break;
            default: System.out.println("Invalid value");
        }

        int future_day = (day + days_after) % 7;
        switch (future_day) {
            case 0: daysAfterString = "Sunday"; break;
            case 1: daysAfterString = "Monday"; break;
            case 2: daysAfterString = "Tuesday"; break;
            case 3: daysAfterString = "Wednesday"; break;
            case 4: daysAfterString = "Thursday"; break;
            case 5: daysAfterString = "Friday"; break;
            case 6: daysAfterString = "Saturday"; break;
        }

        System.out.println("Today is " + dayString + " and the future day is " + daysAfterString);
    }
}