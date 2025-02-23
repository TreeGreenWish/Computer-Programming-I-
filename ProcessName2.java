import java.util.Scanner;

public class ProcessName2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fullName = "";
        
        while (fullName.length() < 5 || !fullName.contains(" ")) {
            System.out.print("Type your name: ");
            fullName = console.nextLine().trim();
            
            if (fullName.length() < 5 || !fullName.contains(" ")) {
                System.out.println("Error, must be at least 5 chars with a space.");
            }
        }
        
        int spaceIndex = fullName.indexOf(' ');
        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);
        
        String name = (lastName + ", " + firstName.charAt(0) + ".");
        
        System.out.println("Your name is: " + name);
    }
}
