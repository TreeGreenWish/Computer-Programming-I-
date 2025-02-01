/*
Student Name: Tyler McCardle
Assignment #1: Rocket Ship
Assignment Description: use a class constant SIZE to resize a Rocket Ship Design 
Issue Date: 1/27/2025
Due Date: 2/2/25
Course: COSC 1336-020
Instructor: Frank Yang
*/
public class DrawRocket{

public static final int SIZE = 3;

public static void main(String [] args){

rocketblast();
drawline();
tophalf();
bottomhalf();
drawline();
bottomhalf();
tophalf();
drawline();
rocketblast();
}
   //line decoration
   public static void drawline(){
   System.out.print("+");
   
      for(int i = 1; i<= SIZE * 2; i++){
      System.out.print("=*");
      }
   System.out.print("+");
   System.out.println();
  
   }
     //top half of pattern
   public static void tophalf(){
       
   //height
   for(int h =1; h<=SIZE; h++){
   
      System.out.print("|");

      //dots
      for(int d =1; d <= SIZE-h; d++){
      System.out.print(".");
      
      }
      
      // points
      for(int p =1; p<= h; p++){
      System.out.print("/\\");
      
       }
       
      //middle dots
      for(int d = 1; d<= (-1 * h + SIZE)*2 ; d++){
      System.out.print(".");
      }
      
      
       // points
      for(int p =1; p<= h; p++){
      System.out.print("/\\");
      
      }
      
      //dots
      for(int d =1; d <= SIZE-h; d++){
      System.out.print(".");
      
      }

    System.out.print("|");
    System.out.println();
   }
  
   }
   
   
   //bottom half of diamond
   public static void bottomhalf(){
   
    //height
    for(int h =1; h<=SIZE; h++){
   
      System.out.print("|");

      //dots
      for(int d =1; d <= h-1; d++){
      System.out.print(".");
      
      }
      
      // points
      for(int p =0; p<= -1 * h + SIZE ; p++){
      System.out.print("\\/");
      
      }
       
      //middle dots
      for(int d =1; d <= h * 2 -2; d++){
      System.out.print(".");
      }
 
      
       // points
      for(int p =0; p<= -1 * h +SIZE; p++){
      System.out.print("\\/");
      
      }
      
      //dots
      for(int d =1; d <= h-1; d++){
      System.out.print(".");
      
      }


    System.out.print("|");
    System.out.println();
   }

   
   }
   
   public static void rocketblast(){
   
      //height
      for(int r = 1; r<= SIZE *2-1; r++){
         
      // left side
         //spaces
         for(int s =1; s<= -1 *r + SIZE *2; s++){
            System.out.print(" ");
         }
         
         for(int l = 1; l <= r; l++){
            System.out.print("/");
         }
         System.out.print("*");
         
      //right side
         System.out.print("*");
         for(int rs =1; rs <= r; rs++){
            System.out.print("\\");
         }
         
         System.out.println();
      }
   
   }
      
}
   


