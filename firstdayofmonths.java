import java.util.Scanner;

public class firstdayofmonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to hold the names of the months
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        
        // Array to hold the number of days in each month
        int[] daysInMonth = {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };
        
        // Prompt user for year and first day of the year
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year (0=Sunday, 1=Monday, ..., 6=Saturday): ");
        int firstDayOfYear = scanner.nextInt();

        // Adjust February for leap years
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // Set February to 29 days for leap years
        }

        // Display the first day of each month
        for (int month = 0; month < 12; month++) {
            // Calculate the name of the month and the first day
            String dayName = getDayName(firstDayOfYear);
            System.out.printf("%s 1, %d is %s\n", months[month], year, dayName);
            
            // Update the first day of the next month
            firstDayOfYear = (firstDayOfYear + daysInMonth[month]) % 7;
        }

        scanner.close();
    }

    // Check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get the name of the day based on the index
    public static String getDayName(int dayIndex) {
        switch (dayIndex) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "";
        }
    }
}
