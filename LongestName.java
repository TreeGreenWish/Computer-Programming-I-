import java.util.Scanner;

public class LongestName {

    public static void longestName(Scanner console, int n) {
        String longestName = "";
        int longestLength = 0;
        boolean tie = false;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("name #" + i + "? ");
            String name = console.nextLine();
            
           
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            
            if (name.length() > longestLength) {
                longestName = name;
                longestLength = name.length();
                tie = false;  
            } else if (name.length() == longestLength) {
                tie = true;
            }
        }

           System.out.println(longestName + "'s name is longest");
        if (tie) {
            System.out.println("(There was a tie!)");
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Sample 1
        longestName(console, 5);

        // Sample 2
        longestName(console, 7);
    }
}
