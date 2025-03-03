import java.util.*;
import java.io.*;

public class FlipLines {
    public static void flipLines(Scanner input) {
        while (input.hasNextLine()) {
            String firstLine = input.nextLine();
            if (input.hasNextLine()) {
                String secondLine = input.nextLine();
                System.out.println(secondLine);
            }
            System.out.println(firstLine);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt"); // Change filename as needed
        Scanner scanner = new Scanner(file);
        flipLines(scanner);
        scanner.close();
    }
}
