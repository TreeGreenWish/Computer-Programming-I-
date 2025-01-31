public class slashfigure {

public static void main (String[] args){

///6 lines
   for(int i =1; i<=6; i++){
  
  //forward slash
      for(int f=1; f<= i *2 -2; f++ ){
         System.out.print("\\");
      }
  
  //exclamation points
      for(int e=1; e<= 26- i*4; e++){
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
  



