public class ReverseNumberSequence {
    public static void main(String[] args) {
        // Outer loop to print 4 lines
        for (int i = 1; i <= 4; i++) {
            // Inner loop to print the decreasing sequence of numbers from 9 to 1
            for (int j = 9; j >= 1; j--) {
                // Print the number j, nine times
                for (int k = 1; k <= 9; k++) {
                    System.out.print(j); // Pint the number j
                }
            }
            // Move to the next line after completing one line
            System.out.println();
        }
    }
}