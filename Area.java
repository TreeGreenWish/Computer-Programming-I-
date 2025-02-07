public class Area {
   public static void main(String[] args){
      area(2.0);

      
     }
     public static double area(double radius){
      double a = Math.PI * Math.pow(radius, 2);
      System.out.println(a);
      return a;
      
     }
}