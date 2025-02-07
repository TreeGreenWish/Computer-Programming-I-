public class ConvertNames{
   public static void main(String[] args){
      System.out.println(convert("Kane, Erica"));
      System.out.println(convert("Chandler, Adam"));
      System.out.println(convert("Martin, Tadd"));
   }
   
   public static String convert(String name){
      int commaIndex = name.indexOf(",");
      String lastName = name.substring(0, commaIndex);
      String firstName = name.substring(commaIndex + 2, name.length());
      return firstName +" " + lastName.toUpperCase();
   
   }
}