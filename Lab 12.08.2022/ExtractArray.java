package Collections;
/*
 *@author Arnab Kumar Hoodati 
 *
 */
import java.util.ArrayList;
import java.util.List;

public class ExtractArray {

	public static void main(String[] args) {
		//creating array list
		List<String> al = new ArrayList<String>();
		//adding object to array list
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		System.out.println("Original list : "+al); //print the original array list
		List<String> s = al.subList(0, 3);	//Extracting
		System.out.println("First Three Elements : "+s);	//print after extract

	}
}