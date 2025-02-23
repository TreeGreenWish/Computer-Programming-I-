import java.util.Scanner;
//prints factors of a user given number
public class PrintFactors {
    public static void printFactors(int number) {
        int i = 1;
        boolean first = true;
        while (i <= number) {
            if (number % i == 0) {
                if (!first) {
                    System.out.print(" and ");
                }
                System.out.print(i);
                first = false;
            }
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = console.nextInt();
        printFactors(number);
    }
}