public class DigitSumCalculator {
    public static void main(String[] args) {
        System.out.println(digitSum(29107));  // Output: 19
        System.out.println(digitSum(-456));   // Output: 15
    }

    public static int digitSum(int n) {
        n = Math.abs(n); // Convert to positive if negative
        int total = 0;
        
        while (n > 0) {
            total = total + n % 10; // Add the last digit to total
            n = n / 10; // Remove the last digit
        }
        
        return total;
}