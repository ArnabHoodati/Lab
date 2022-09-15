package com.example;

import java.util.Scanner;

import com.example.daoImpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDaoImpl dao = new StudentDaoImpl();
    	do {
    		Scanner sc = new Scanner(System.in);
    		// press key what you want to store
    		System.out.println("Press 1 for add student \nPress 2 for display student");
    		int choice = sc.nextInt();	//user input
    		switch(choice) {	// switch case to choose the the operation
    		case 1: dao.addStudent();
    		break;
    		case 2: dao.fetchStudent();
    		break;
    		}
    	}while(true);
    }
}
