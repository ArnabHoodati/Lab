/*
@author: Arnab Kumar Hoodati
*/

//Draw a Pattern of pyramid
public class Pyramid {
	public static void main(String[] args) {
		int i, j, n=5;		//Define variable
		for (i=0; i<n; i++)	//outerloop of rows
		{
		for (j=n-i; j>1; j--)	//inner loop of space
		{
		    System.out.println(" ");	//Space Counting
		}
		for (j=0; j<i; j++)	//inner loop of column
		{
		    System.out.println("* ");
		}
		System.out.println();
		}
	}
}
