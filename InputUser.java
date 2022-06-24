/*
@author: Arnab Kumar Hoodati
*/



// Java Program for Get input from user
import java.util.Scanner;
class InputUser {
    public static void main(String[] args) {
    	
        // Scanner definition
        Scanner input = new Scanner(System.in);
        String name;	
        
        // Asking for input from user
        System.out.print("Enter Your name: ");
        
        // Integer reading internally
        name = input.nextLine();
        
        
        // Printing name
        System.out.println("My name is: " + name);

    }
}
