import java.util.Scanner;

public class PrintLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = console.nextLine();
        printLetters(text);
    }

    // Method to print letters separated by dashes
    public static void printLetters(String text) {
        if (text.length() == 0) { // Check if the string is empty
            return; // Exit the method without printing anything
        }

        int i = 0;
        while (i < text.length()) {
            System.out.print(text.charAt(i)); // Print the current character
            if (i < text.length() - 1) {
                System.out.print("-"); // Print a dash if it's not the last character
            }
            i++; // Move to the next character
        }
        System.out.println(); // Move to a new line after printing
    }
}