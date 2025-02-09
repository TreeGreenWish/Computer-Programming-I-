import java.util.Scanner; //imported scanner

public class StringOops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = console.next(); //nextString is next
        process(name);
    }
    public static void process(String name) { //capitalize String, remove "" 
            name = name.replace("a", "e");//string object name
            name = name.toUpperCase(); //Capitalize C, add name =
            name = name.substring(0); //removed 3 to process full name // add name =
        System.out.println(name + " has " + name.length() + " letters"); //add parentheses to length method
    } 
}