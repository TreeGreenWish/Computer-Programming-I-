public class SlashFigure2 {
public static final int SIZE = 7;


public static void main (String[] args){

//lines
   for(int i =1; i<=SIZE; i++){
  
  //forward slash
      for(int f=1; f<= i *2 -2; f++ ){
         System.out.print("\\");
      }
  
  //exclamation points
      for(int e=1; e<= -4 *i +(4 * SIZE +2) ; e++){
         System.out.print("!");
      }
  //backslash lines 
     for(int b=1; b<= i* 2-2; b++){
         System.out.print("/");
       }
   System.out.println();

   }
   
}

}
  



