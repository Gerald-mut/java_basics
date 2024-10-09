public class pyramidpattern {
    public static void main(String[] args) {
        int rows = 8; // Total number of rows

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for pyramid shape
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  "); // Two spaces for better alignment
            }
            // Print increasing powers of 2
            for (int j = 0; j <= i; j++) {
                System.out.print((int)Math.pow(2, j) + " ");
            }
            // Print decreasing powers of 2
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int)Math.pow(2, j) + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
