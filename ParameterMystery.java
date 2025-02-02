public class ParameterMystery{
   public static void main(String[] args){
      int x = 9;
      String y = "x";  // unchanged local variables
      int z = 2;
      
      mystery(x, y, z);
      System.out.println(x + " " + y + " " + z);
      mystery(z, "y", x);
      mystery(x + 3, y + z, x + z);
      //the method "mystery" is calling the three parameters defined in the method
      //below, the name does not matter, but the order does, x goes to the first
      //y goes to the second, and z goes to the third
   }
   
   public static void mystery(int x, String z, int y){
      x++;
      y--;
      System.out.println(z + " " + y + " " + x);
   }
}