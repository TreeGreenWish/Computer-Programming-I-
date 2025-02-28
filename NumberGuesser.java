//Write a method named makeGuesses that will guess numbers between 1 and 50 inclusive until it makes a guess of at least 48. 
//It should report each guess and at the end should report the total number of guesses made.
import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses() {
        Random rand = new Random();
        int guess = 0;
        int totalGuesses = 0;

               while (guess < 48) {
            guess = rand.nextInt(50) + 1; 
            System.out.println("guess = " + guess); 
            totalGuesses++; 
        }

        System.out.println("total guesses = " + totalGuesses);
    }
}