package com.book;

import java.util.Scanner;

import com.book.daoimpl.BookDaoImpl;

public class App 
{

	public static void main( String[] args )
    {
		//creating object of daoimpl class
    	BookDaoImpl dao = new BookDaoImpl();
    	char c;	//declare variable
    	//do while loop
    	 do {
    		 Scanner scan = new Scanner(System.in);	//creating scanner object
    		 //press the option what you want
    		 System.out.println("Press 1 for add Book \nPress 2 for display Book\nPress 3 for Exit");
    		 int ch = scan.nextInt();	//user input for option
    		 switch(ch) {	//using switch case
    		 case 1:
    			 dao.addBook();	//call the add book method
    			 break;
    		 case 2:
    			 dao.fetchBook(); //call the book details display method
    			 break;
    		 case 3:
    			 System.exit(0);	//for exit
    		 default: 
    			 System.out.println("Invalid choice");	//if you press wrong input
    		 }
    		 //if you want to continue the operation
    		 System.out.println("Do you want to continue? Y/N");
    		  c = scan.next().charAt(0);	//user input
    	 }while(c=='Y' || c=='y');	
    	 System.out.println("Thank You");	//print the line
   }
}

