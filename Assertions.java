public class Assertions{
   public static void main(String[] args){
      for (int i = 1; i<=100; i++){
         int result = mystery(i);
         System.out.println("mystery(" + i + ") returns " + result);
      }
   }
   public static int mystery(int n){
      int x =0;
      //point A 
      while (n % 2 == 0){
         //point B
         n = n / 2;
         //point C
         x++;
         //point D
      }
      //point E
      return x;
   }
}