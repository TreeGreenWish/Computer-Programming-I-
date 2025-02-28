import java.io.*;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) throws FileNotFoundException {
        int wordCount = 0;
        Scanner input = new Scanner(new File("wordinput.txt"));
        
        while (input.hasNext()) {
          String word = input.next();
            wordCount++;
        }
        
        System.out.println("Total words = " + wordCount);
    }
}