package Collections;
/*
 *@author Arnab Kumar Hoodati 
 *
 */
import java.util.LinkedList;

public class ReplaceLinkedList {

	public static void main(String[] args) {
		//creating linked list
		  LinkedList<String> ll = new LinkedList<String>(); 
		//adding object to linked list
			ll.add("Violet");
		  	ll.add("Indigo");
			ll.add("Black");
			ll.add("Green");
			ll.add("Yellow");
			ll.add("Orange");
			ll.add("Red");
			System.out.println("Original List : "+ll); //print the original list
			ll.set (2, "Blue");	//replace(set()) 3rd position element in linked list 
			System.out.println("Replace list : "+ll); //print the list after replacing
			  }
		}
