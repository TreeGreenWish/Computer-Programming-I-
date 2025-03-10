/*
Student Name: Tyler McCardle
Assignment #4: Baby Names
Assignment Description: Prompts the user for a name, and prints statistics about the name's popularity througout the decades, and draws a graph
Issue Date: 2/17/25
Due Date: 3/2/25
Course: COSC 1336-020
Instructor: Frank Yang
*/
import java.util.Scanner;
import java.util.*;

public class Guess {
    // Class constant for maximum number in the game
    private static final int max_number = 100;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {
        int totalGames = 0;
        int totalGuesses = 0;
        int maxGuesses = 0;
        boolean playAgain = true;
        
        giveInstructions();
        
        while (playAgain) {
            int guessesThisGame = playOneGame();
            totalGames++;
            totalGuesses += guessesThisGame;
            maxGuesses = Math.max(maxGuesses, guessesThisGame);
            
            System.out.print("Do you want to play again? ");
            String response = scanner.next();
            playAgain = response.toLowerCase().startsWith("y");
        }
        
        reportResults(totalGames, totalGuesses, maxGuesses);
    }
    
    // Displays instructions to the user
    private static void giveInstructions() {
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("I will think of a number between 1 and " + max_number);
        System.out.println("and will allow you to guess until you get it.");
        System.out.println("For each guess, I will tell you whether the");
        System.out.println("right answer is higher or lower than your guess.");
        System.out.println();
    }
    
    // Plays one game and returns number of guesses taken
    private static int playOneGame() {
        int number = rand.nextInt(max_number) + 1; 
        int guesses = 0;
        
        System.out.println("I'm thinking of a number...");
        
        while (true) {
            System.out.print("Your guess? ");
            int guess = scanner.nextInt();
            guesses++;
            
            if (guess < number) {
                System.out.println("higher");
            } else if (guess > number) {
                System.out.println("lower");
            } else {
                System.out.println("\nYou got it right in " + guesses + " guesses\n");
                return guesses;
            }
        }
    }
    
    // Reports overall statistics
    private static void reportResults(int games, int guesses, int max) {
        double average = (double) guesses / games;
        
        System.out.println("Overall results:");
        System.out.println("    total games   = " + games);
        System.out.println("    total guesses = " + guesses);
        System.out.println("    guesses/game  = " + average);
        System.out.println("    max guesses   = " + max);
    }
}