import java.util.Scanner;
class InputUser {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        String name;	
        System.out.print("Enter Your name: ");
        name = input.nextLine();

        System.out.println("My name is: " + name);

    }
}