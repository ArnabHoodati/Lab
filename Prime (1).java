import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int n,i,r = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i=n/2;i<=n/2;i++)
		{
		    if(n%i==0)
		    {
		        r=1;
		        break;
		    }
		}
		    if(r==0)
		    System.out.println(n+"is prime no.");
		    else
		    System.out.println(n+"is not a prime no.");
		
	}
}