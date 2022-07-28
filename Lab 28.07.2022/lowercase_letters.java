package Lab;

public class lowercase_letters { //Main class
	   public static void main(String[] args) {	//Main Method
		   //Check method and printing output
		    System.out.println(main1("java_exercises"));
			System.out.println(main1("Java_Exercises"));
	        }
	   public static String main1(String s) {
		   if (s.matches("^[a-z]+_[a-z]+$")) //Logic
	                return "Found a match!";
	       else
	                return "Not matched!";
	   }
	}
