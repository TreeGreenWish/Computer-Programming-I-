public class AgeCheck2 {
    public static void main(String[] args) {
        int myAge = 15;   // I am 19; let me see if I can drive
        message(myAge);
    }
    
    public static void message(int age) {
         if (age >= 21) {
            System.out.println("I can legally purchase alcohol!");
        } if (age >= 17) {
            System.out.println("I can purchase a ticket to an R-rated movie.");
        } if (age >= 16) {
            System.out.println("I can get my driver's license!");
        }
    }
}