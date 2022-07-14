/*
 * @author Arnab Kumar Hoodati
 * 
 * Interface
 */


import java.util.Scanner;
interface AdvancedArithmetic {
  int divisorsum(int n);
}
public class Main       
{
	public static void main(String[] args) {        //main method
	    System.out.println("Enter number: ");
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		MyCalculator obj = new MyCalculator();      //creating object of MyCalculator class

		System.out.println("I implimented: AdvancedArithmetic "+obj.divisorsum(n) + "\n");
	}
}
class MyCalculator implements AdvancedArithmetic{       //class impliments interface
    
    public int divisorsum(int n){
        int sum = 1;
        for (int i=2;i<=n;i++){
            if (n%i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}

