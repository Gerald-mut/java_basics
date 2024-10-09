public class Milestokillometers {
    public static void main(String[] args) {
        System.out.printf("%-10s %-12s | %-12s %-12s%n", "Miles", "Kilometers", "Kilometers", "Miles");
        
        // Loop for miles to kilometers conversion (1 to 10)
        for (int miles = 1; miles <= 10; miles++) {
            double kilometersFromMiles = miles * 1.609; // 1 mile = 1.609 kilometers
            System.out.printf("%-10d %-12.3f | ", miles, kilometersFromMiles);
            
            // Loop for kilometers to miles conversion (20 to 65)
            if (miles >= 2) { // Start displaying kilometers after the first iteration
                int kilometers = 20 + (miles - 2) * 5; // Start from 20, increment by 5
                double milesFromKilometers = kilometers / 1.609; // 1 kilometer = 0.621371 miles
                System.out.printf("%-12d %-12.3f%n", kilometers, milesFromKilometers);
            }
        }

        // Additional rows for kilometers to miles conversion for 60 and 65
        System.out.printf("%-10s %-12s | %-12d %-12.3f%n", "", "", 60, 60 / 1.609);
        System.out.printf("%-10s %-12s | %-12d %-12.3f%n", "", "", 65, 65 / 1.609);
    }
}
