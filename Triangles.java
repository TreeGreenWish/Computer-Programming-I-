import java.util.*;

public class Triangles{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      System.out.print("Triangle size? ");
      int triangleSize = console.nextInt();
         drawTriangle(triangleSize);
      }
   
   public static void drawTriangle (int size) {
     for( int line =1; line<= size; line++){
      printString(" ", -1 * line + size);
      printString("*", 2 * line -1);
         System.out.println();
     }

      }
   
   public static void printString(String s, int times){
      for (int i =1; i <= times; i++){
         System.out.print(s);
      }
   }
}
