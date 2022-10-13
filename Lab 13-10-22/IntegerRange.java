package Lab;
/*
 * @author Arnab kumar Hoodati
 */

import java.util.Scanner;
/*
 Q1: Given a no. of n for each integer i in the range id 1 to n. print one value per line.
if i is multiple of 3 and 5; print good morning
if i is multiple of 3 but not 5; print good
if i is multiple of 5 but not 3; print morning
if i is not multiple of  3 and 5; print value of i.
*/

public class IntegerRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//creating scanner class object
		System.out.println("Enter range:");		//enter range
		int n = sc.nextInt();	//user input for range
		for(int i=0;i<=n;i++) {	//for loop
			//condition
			if(i%15==0)		
				System.out.println("Good Morning");	//print the line
			else if (i%3==0 && i%5!=0)
				System.out.println("Good");	//print the line
			else if (i%5==0 && i%3!=0)
				System.out.println("Morning");		//print the line
			else
				System.out.println(i);	//print the value of 'i'
				
			}
		}

	}

