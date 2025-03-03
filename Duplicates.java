import java.util.Scanner;

public class Duplicates {
    
    public static void printDuplicates(Scanner input) {
        // Loop through each line in the input file
        while (input.hasNextLine()) {
            // Get the next line of input
            String line = input.nextLine();
            
            // Create a new scanner for the current line to split it into tokens
            Scanner lineScanner = new Scanner(line);
            
            // Initialize the previous token as an empty string (avoiding null)
            String prevToken = "";
            // Initialize the count to 1 (as each token is counted at least once)
            int count = 1;
            
            // Flag to track if any duplicates were found on this line
            boolean hasDuplicates = false;
            
            // Loop through the tokens of the current line
            while (lineScanner.hasNext()) {
                // Get the current token
                String currentToken = lineScanner.next();
                
                // Check if the current token is the same as the previous token
                if (currentToken.equals(prevToken)) {
                    // If the same, increment the count of consecutive occurrences
                    count++;
                } else {
                    // If the current token is different from the previous one
                    // Check if the previous token had consecutive duplicates
                    if (count > 1) {
                        // Print the token and the count of its consecutive occurrences
                        System.out.print(prevToken + "*" + count + " ");
                        hasDuplicates = true; // Set flag to true since we found duplicates
                    }
                    // Reset the count for the new token
                    count = 1;
                }
                
                // Update the previous token to the current one
                prevToken = currentToken;
            }
            
            // After the loop, check if the last token had consecutive duplicates
            if (count > 1) {
                // Print the last token with its count
                System.out.print(prevToken + "*" + count);
                hasDuplicates = true;
            }

            // If duplicates were found, print a new line for this line of input
            if (hasDuplicates) {
                System.out.println();
            } else {
                // If no duplicates were found, print a blank line
                System.out.println();
            }
            
            // Close the line scanner to release resources
            lineScanner.close();
        }
    }

    public static void main(String[] args) {
        // Test with a Scanner object that reads from a file or input stream.
        // For testing purposes, we can use System.in or a StringReader.
        
        String inputData = "hello how how are you you you you\n" +
                           "I I I am Jack's Jack's smirking smirking smirking smirking smirking revenge\n" +
                           "   bow  wow wow yippee yippee   yo yippee   yippee yay  yay yay\n" +
                           "one fish two fish red fish blue fish\n" +
                           "It's the Muppet Show, wakka wakka wakka";
        
        Scanner input = new Scanner(inputData);
        printDuplicates(input);
    }
}
