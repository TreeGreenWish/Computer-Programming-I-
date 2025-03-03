import java.util.Scanner;

public class CoinFlip {
    public static void coinFlip(Scanner input) {
        // Process each line in the input file
        while (input.hasNextLine()) {
            String line = input.nextLine();
            
            // Initialize counters
            int headCount = 0;
            int totalFlips = 0;
            
            // Split the line into individual tokens (coin flips)
            Scanner lineScanner = new Scanner(line);
            
            // Process each token in the line
            while (lineScanner.hasNext()) {
                String flip = lineScanner.next();
                if (flip.equalsIgnoreCase("H")) {
                    headCount++;
                }
                if (flip.equalsIgnoreCase("H") || flip.equalsIgnoreCase("T")) {
                    totalFlips++;
                }
            }
            
            // Calculate the percentage of heads
            double headPercentage = (totalFlips > 0) ? (headCount * 100.0 / totalFlips) : 0.0;
            
            // Print the results for the current line
            System.out.println(headCount + " heads (" + Math.round(headPercentage * 10.0) / 10.0 + "%)");
            
            // Print "You win!" if the percentage of heads is greater than 50%
            if (headPercentage > 50.0) {
                System.out.println("You win!");
            }
            // Print a blank line after each set of flips
            System.out.println();
            
            // Close the lineScanner for the current line
            lineScanner.close();
        }
    }

    public static void main(String[] args) {
        // Example usage
        Scanner input = new Scanner("H T H H T\nT t   t T h  H\n   h");
        coinFlip(input);
    }
}
