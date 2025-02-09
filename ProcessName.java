import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        
        String fullName = console.nextLine(); 
        int spaceIndex = fullName.indexOf(' ');
        
        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1); 
        
        System.out.println("Your name is: " + lastName + ", " + firstName.charAt(0) + ".");
        
    }
}