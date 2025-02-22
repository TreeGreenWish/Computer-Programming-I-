import java.util.*;

public class CountPrimes {
   public static void main (String[] args){
      Scanner console = new Scanner(System.in);
      System.out.print("Maximum number? ");
      int max = console.nextInt();
      int primeCount = 0;   
         for (int i = 1; i<= max; i++) {
           if(countFactors(i) == 2){
               primeCount++;
               System.out.print(i + " ");
            }
         }
         System.out.println();
         
         double percent = 100.0 * primeCount / max;
       // System.out.printf("%d primes (%.2f%%)" primeCount, percent);
          System.out.println(primeCount + " primes (" + percent + "%)");
      
   }
   
   public static int countFactors(int number){
      int count =0;
      
      for( int i = 1; i<=number; i++){         
         if(number % i ==0){
         count++;       
         }
      }
      return count;
   }
} 