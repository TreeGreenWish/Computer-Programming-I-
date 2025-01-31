public class Mirror{
   public static void main(String[] args) {
   
      drawLine();
      drawHalf1();
      drawHalf2();
      drawLine();
      
   }
   
   public static void drawLine() {
      System.out.print("*");
      for(int i =1; i <=16; i++){
         System.out.print("=");
      }
      System.out.print("*");
      System.out.println();
   }
   
   public static void drawHalf1(){
   
      for(int line =1; line <=4; line++){
         System.out.print("|");
         for(int space = 1; space <=8 -2*line; space++){
         System.out.print(" ");
         }
         System.out.print("()");
         for(int dot=1; dot<=4 *line-4; dot ++){
            System.out.print(".");
         }
         System.out.print("()");
         for(int space = 1; space <=8 -2*line; space++){
         System.out.print(" ");
         }
         System.out.print("|");
         System.out.println();
      }
   }
   
   public static void drawHalf2(){
      for (int line =1; line<=4; line++){
         System.out.print("|");
         for(int space = 1; space<=2 *line-2; space++){
            System.out.print(" ");
         }
         System.out.print("()");
         for(int dot=1; dot <=16-4*line; dot++){
            System.out.print(".");
         }
         System.out.print("()");
         for(int space = 1; space<= 2*line-2; space++){
            System.out.print(" ");
         }
         System.out.print("|");
         System.out.println();
      }
      
   
   }
   
}