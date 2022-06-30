/*
@author: Arnab Kumar Hoodati
*/

//Find Factorial of any number

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int n,i,f=1;			//Declaring Variable
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);		//input From User
		n=sc.nextInt();
		if (n<=0)
		System.out.println("Enter a positive integer number");		
		else 
		{
		    for(i=2;i<=n;i++)		//logic
		        f=f*i;			//Value Store
			
		    System.out.println("Factorial of" +n+" is ="+f);
		}
	}
}
