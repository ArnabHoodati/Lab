/*
*@Author Arnab Kumar Hoodati
*/
//Draw a Pattern of pyramid

import java.util.Scanner;

public class PyramidPattern{
    
    public static void main(String[]args){

        int i,j,n;	//Define variable
	Scanner sc = new Scanner(System.in);

	//input from user
        System.out.print("Enter rows: ");
        n = sc.nextInt();

        for (i=0; i<n; i++)		//outer loop for rows
        {
 
            for (j=n-i; j>1; j--)		//inner loop for spaces
            {
                System.out.print(" ");		//Spaces counting
            }
  
            for (j=0; j<=i; j++ )		//inner loop for coloum
            {
                System.out.print("* ");
            }
  
            System.out.println();		//print pattern
        }
    }     
    
}
