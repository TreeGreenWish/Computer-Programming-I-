public class Power {
    public static int pow(int base, int exponent) {
        int result = 1;
        
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(pow(3, 4));  // Output: 81
    }
}