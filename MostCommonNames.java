import java.util.*;

public class MostCommonNames {

    public static int mostCommonNames(Scanner fileScanner) {
        String uniqueNames = ""; // To store unique names manually
        int totalUniqueNames = 0; // To track the number of unique names

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine().trim(); // Trim leading/trailing spaces
            Scanner lineScanner = new Scanner(line); // Create a Scanner for the current line
            
            String mostCommonName = ""; // To track the most common name in the line
            int mostCommonCount = 0; // To track the most common name count
            String currentName = ""; // To track the current name being processed
            int currentCount = 0; // To count occurrences of the current name
            
            while (lineScanner.hasNext()) {
                String name = lineScanner.next().trim(); // Trim name to handle extra spaces
                
                if (name.isEmpty()) continue; // Skip empty names
                
                // Add name to the unique names string if it's not already present
                if (!isNamePresent(name, uniqueNames)) {
                    uniqueNames += name + " "; // Add the new name to the unique names string
                    totalUniqueNames++; // Increment total unique name count
                }
                
                if (name.equals(currentName)) {
                    currentCount++; // Increment the count if it's the same as the last name
                } else {
                    // If the previous name was more frequent, update the most common name
                    if (currentCount > mostCommonCount) {
                        mostCommonName = currentName;
                        mostCommonCount = currentCount;
                    }
                    // Start counting the new name
                    currentName = name;
                    currentCount = 1;
                }
            }
            
            // Check the last name count after exiting the loop
            if (currentCount > mostCommonCount) {
                mostCommonName = currentName;
                mostCommonCount = currentCount;
            }
            
            // Print the most common name for the current line
            System.out.println("Most common: " + mostCommonName);
            lineScanner.close();
        }
        
        // Return the total number of unique names
        return totalUniqueNames;
    }

    // Helper method to check if a name is already in the unique names string
    private static boolean isNamePresent(String name, String uniqueNames) {
        // Check if the name is found and ensure it is not part of another name
        String pattern = " " + name + " "; // Check name with surrounding spaces
        return uniqueNames.contains(pattern);
    }

    public static void main(String[] args) {
        // Example usage with a Scanner for an input file
        String input = "  Benson Eric\nJim\nBen Ben Ben  Ben Ben  Ben Catriona  Catriona Jenny Ted Jenny\n";
        Scanner fileScanner = new Scanner(input);
        int uniqueNamesCount = mostCommonNames(fileScanner);
        System.out.println("Total unique names: " + uniqueNamesCount); // Should print 6
    }
}
