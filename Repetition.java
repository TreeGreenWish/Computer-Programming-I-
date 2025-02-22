public class Repetition {
    public static String repl(String str, int rep) {
        // Initialize an empty result string
        String result = "";

        // If repetitions is 0 or less, return an empty string
        if (rep <= 0) {
            return result;
        }

        // Concatenate the string the specified number of times
        for (int i = 0; i < rep; i++) {
            result = result + str;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(repl("hello", 3));  // Output: hellohellohello
        System.out.println(repl("world", 0));  // Output: (empty string)
    }
}