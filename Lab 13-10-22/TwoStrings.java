package Lab;
/*
 * @author Arnab kumar Hoodati
 */

import java.util.Scanner;
/*
Q2: Take a variable from scanner class, given two (A,B) strings in lowercase.
1. calculate the sum of string length of A and B.
2. check either A > B or not. (lexicographically) true/false
3. capitalized first latter of A and B.
*/

public class TwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//creating scanner class object
		System.out.println("Enter string 1:");	
		String A = sc.next();	//user input for string 1
		System.out.println("Enter string 2:");
		String B = sc.next();	//user input for string 2
        // calculate sum of lengths of two string value
		System.out.println("Sum of length of two strings: "+(A.length() + B.length()));
		
		if (A.compareTo(B)<0) { //comparing two strings
			//print the comparing value
			System.out.println("Comparing two strings: "+true);
		}
		else {
			System.out.println("Comparing two strings: "+false);
		}
		//capitalized first latter of two string value
	    A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
	    B = (B.substring(0,1)).toUpperCase() + B.substring(1);
	    //print the value
	    System.out.println("Capitalized fist letter of two strings: "+(A + " " + B));

	}

}
