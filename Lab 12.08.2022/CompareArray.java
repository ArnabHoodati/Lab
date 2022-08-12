package Collections;
/*
 *@author Arnab Kumar Hoodati 
 *
 */
import java.util.ArrayList;
import java.util.List;

public class CompareArray {
	public static void main(String[] args) {
		//creating first array list
		List<String> al = new ArrayList<String>();
		//adding object to first array list
		al.add("Red");
		al.add("Green");
		al.add("Black");
		al.add("White");
		al.add("Pink");
		System.out.println("List 1 : "+al);	//Print the list 1
		
		//creating second array list
		List<String> al1 = new ArrayList<String>();
		//adding object to second array list
		al1.add("Red");
		al1.add("Green");
		al1.add("Black");
		al1.add("Pink");
		System.out.println("List 2 : "+al1);	//print the list 2
		boolean b = al.equals(al1);	//comparing two list
		System.out.println("After comparing, value : "+b);	//if match true otherwise false
	}
}
