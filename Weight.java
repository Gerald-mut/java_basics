public class Weight {
    public static void main(String[] args) {
        System.out.printf("%-12s %-12s%n", "Kilograms", "Pounds");
        
        // Loop through kilograms from 1 to 199
        for (int kg = 1; kg <= 199; kg += 2) {
            // Convert kilograms to pounds
            double pounds = kg * 2.2;
            // Display the result
            System.out.printf("%-12d %-12.1f%n", kg, pounds);
        }
    }
}
