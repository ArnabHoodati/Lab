public class Amstrong {
public static void main (String[] args) {
	int n =371, num, temp, t=0;
	num=n;
	while (n!=0)
	{
		temp=n%10;
		t=t+temp*temp*temp;
		n= n/10;
	}
	if (t==num)
	System.out.println(num+  " is an Amstrong Number.");
	else
	System.out.println(num+  " is not an Amstrong Number.");
}
}