public class complexfigures {
public static final int SIZE = 20;

   public static void main (String[] args) {
      for (int line = 1; line <=SIZE; line++) {
      
         for (int slash =1; slash <= (-4 * line + 4 * SIZE); slash++) {
            System.out.print("/");
          }  
         for (int star = 1; star <= (8 * line -8); star++) {
            System.out.print("*");
         }
         for(int slash = 1; slash <=(-4 * line + 4 * SIZE); slash ++) {
            System.out.print("\\");
         }
      
     System.out.println (); 

      }
   
}
}