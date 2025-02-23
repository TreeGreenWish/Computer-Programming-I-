import java.util.*;
//roll dice until 3 odd numbers in a row
public class DiceRoll{
   public static void main(String[] args){
      System.out.println("Let's roll some dice!");
      Random rand = new Random();
      int odds = 0;
      int rolls =0;
      
      while(odds < 3){ //while i have not rolled 3 odds in a row
       int roll = rand.nextInt(6)+1; // 7 would include die roll of 0
       System.out.println("You rolled a " + roll);
       
       rolls++;
       
         if(roll % 2 ==1){ //check if the roll is odd
            odds ++;  
         } else {    //even number
            odds =0; //even number resets odds to 0
         }
      }
      System.out.println("Three in a row after " + rolls + " rolls.");
      
   }
  
}