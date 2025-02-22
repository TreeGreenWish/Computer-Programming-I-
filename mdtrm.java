public class mdtrm {

    public static boolean hasOddEven(int a, int b, int c) {     
        boolean Even = (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);
        boolean Odd = (a % 2 != 0) || (b % 2 != 0) || (c % 2 != 0);

        return Even && Odd;
    }

    public static void main(String[] args) {
        System.out.println(hasOddEven(2, 4, 6)); // false
        System.out.println(hasOddEven(14, 7, 5)); // true
        System.out.println(hasOddEven(2, 3, 4)); // true
    }
}