   /*
Student Name: yler McCardle
Assignment Syntax Errors
Assignment Description: Find 9 errors
Issue Date: 1/27/2025
Due Date: 2/2/2025
Course: COSC 1336-020
Instructor: Frank Yang
*/
public class Parameters {
    public static void main(String[] args) { //missing String[] args
        double y = 867.5309; // change bubble to y
        double x = 10.01;
        int z = 5; // declare z in main
        
        printer(x, y, z); // remove type from method call
                          //add call for z
        //printer(x);     //incorrect method call
       // printer("barack", "obama"); //incorrect method call
        System.out.println("z = " + z);
    }

    public static void printer(double x, double y, int z) {//added parameters
                                                           //added z parameter to method
       
        System.out.println("x = " +  x + " and y = " + y); //remove type from x
        System.out.println("The value from main is: " + z); //call z from main
    }
}