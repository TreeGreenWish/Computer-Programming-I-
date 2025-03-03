public class MinGapProgram {
    public static int minGap(int[] array) {
        // Check if array has fewer than 2 elements
        if (array == null || array.length < 2) {
            return 0;
        }
        
        // Initialize minGap with the first gap
        int minGap = array[1] - array[0];
        
        // Iterate through array to find minimum gap
        for (int i = 1; i < array.length - 1; i++) {
            int currentGap = array[i + 1] - array[i];
            if (currentGap < minGap) {
                minGap = currentGap;
            }
        }
        
        return minGap;
    }

    public static void main(String[] args) {
        // Test case 1: {1, 3, 6, 7, 12}
        int[] array1 = {1, 3, 6, 7, 12};
        System.out.println("Test 1: Array = {1, 3, 6, 7, 12}");
        System.out.println("Minimum gap: " + minGap(array1));  // Should print 1
        
        // Test case 2: {3, 5, 11, 4, 8}
        int[] array2 = {3, 5, 11, 4, 8};
        System.out.println("\nTest 2: Array = {3, 5, 11, 4, 8}");
        System.out.println("Minimum gap: " + minGap(array2));  // Should print -7
        
        // Additional test cases
        int[] array3 = {};  // Empty array
        System.out.println("\nTest 3: Empty array");
        System.out.println("Minimum gap: " + minGap(array3));  // Should print 0
        
        int[] array4 = {5};  // Single element
        System.out.println("\nTest 4: Array = {5}");
        System.out.println("Minimum gap: " + minGap(array4));  // Should print 0
        
        int[] array5 = {1, 1};  // Two equal elements
        System.out.println("\nTest 5: Array = {1, 1}");
        System.out.println("Minimum gap: " + minGap(array5));  // Should print 0
    }
}