public class MidpointChecker {
    public static boolean hasMidpoint(int a, int b, int c) {
        if (a * 2 == b + c) {
            return true;
        } else if (b * 2 == a + c) {
            return true;
        } else if (c * 2 == a + b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasMidpoint(4, 6, 8));  // True
        System.out.println(hasMidpoint(2, 10, 6));  // True
        System.out.println(hasMidpoint(8, 8, 8));  // True
        System.out.println(hasMidpoint(25, 10, -5));  // True
        System.out.println(hasMidpoint(3, 1, 3));  // False
        System.out.println(hasMidpoint(1, 3, 1));  // False
        System.out.println(hasMidpoint(21, 9, 58));  // False
        System.out.println(hasMidpoint(2, 8, 16));  // False
    }
}
