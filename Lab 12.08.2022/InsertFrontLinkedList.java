package Collections;
/*
 *@author Arnab Kumar Hoodati 
 *
 */
import java.util.LinkedList;

public class InsertFrontLinkedList {

	public static void main(String[] args) {
		//creating linked list
		  LinkedList<String> ll = new LinkedList<String>(); 
		//adding object to linked list
			ll.add("Indigo");
			ll.add("Blue");
			ll.add("Green");
			ll.add("Yellow");
			ll.add("Orange");
			ll.add("Red");
			System.out.println("Origonal list : "+ll);	//print the original list
			//adding an elements at the 1st position
			ll.addFirst("Violet");
			System.out.println("New list : "+ll); //print the list after inserting element
	}
}
