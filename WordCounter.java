import java.util.Scanner;

public class WordCounter {
    public static int countWords(String input) {
        int lineCount = 0;
        int wordCount = 0;
        
        // Create a Scanner from the input String
        Scanner inputScanner = new Scanner(input);
        
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();   // read one line
            lineCount++;
            Scanner lineScan = new Scanner(line);
            while (lineScan.hasNext()) {      // count tokens in line
                String word = lineScan.next();
                wordCount++;
            }
            lineScan.close();  // Close the inner Scanner
        }
        
        System.out.println("Total lines = " + lineCount);
        System.out.println("Total words = " + wordCount);
        System.out.printf("Average words per line = %.3f\n", (double) wordCount / lineCount);
        
        inputScanner.close();  // Close the main Scanner
        
        return wordCount;  // Return the total number of words
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter text (press Ctrl+D or Ctrl+Z to finish):");
        
        // Read multiple lines until EOF
        StringBuilder inputText = new StringBuilder();
        while (console.hasNextLine()) {
            inputText.append(console.nextLine());
            inputText.append("\n");  // Preserve line breaks
        }
        
        // Call countWords with the collected input
        if (inputText.length() > 0) {
            int words = countWords(inputText.toString());
            System.out.println("Returned word count: " + words);
        } else {
            System.out.println("No input provided.");
        }
        
        console.close();
    }
}