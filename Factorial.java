
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int n,i,f=1;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if (n<=0)
		System.out.println("Enter a positive integer number");
		else 
		{
		    for(i=2;i<=n;i++)
		        f=f*i;
		    System.out.println("Factorial of" +n+" is ="+f);
		}
	}
}