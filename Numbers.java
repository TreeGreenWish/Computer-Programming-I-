public class Numbers {
    public static void main(String[] args) {
        int number = 42;
        for (int i = 1; i <= 1000; i++) {
            number = number * 37 % 103;
        }
        int number2 = number * number;
        System.out.println("result = " + number2);
    }
}