package com.book.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.book.config.HibernateUtil;
import com.book.dao.BookDao;
import com.book.entity.Book;

public class BookDaoImpl implements BookDao {	//interface implements with class
	
	Book b = new Book();	//creating object of entity class
	Scanner sc = new Scanner(System.in);	//creating scanner object
	
	public void addBook() {	//creating method for add new student in DB
		//declare variable
		String title, category, author;
		double price;
		int year;
		//user input
		System.out.println("Enter book title: ");
		title = sc.next();
		System.out.println("Enter book author: ");
		author = sc.next();
		System.out.println("Enter book category: ");
		category = sc.next();
		System.out.println("Enter book price: ");
		price = sc.nextDouble();
		System.out.println("Enter edition year: ");
		year = sc.nextInt();
		//set all data
		b.setBtitle(title);
		b.setBauthor(author);
		b.setBcategory(category);
		b.setPrice(price);
		b.setYear(year);
		//create a object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Begin a unit of work and return the associated Transaction object
		Transaction t = session.beginTransaction();
		session.save(b);	//for adding date
		System.out.println("Book added successfully...");	//print the line
		t.commit();	//transaction close
		session.close();	//session close
	}
	//creating method for display the student data
	public void fetchBook() {
		try {	//try block
		System.out.println("Enter id:");	//print the line
		int id = sc.nextInt();	//user input
		//create a object from HibernateUtil
		Session session = HibernateUtil.getSessionFactory().openSession();
		//identify the id for display the data
		Book b = session.get(Book.class, id);
		//displaying the book data
		System.out.println("-------------Book details-------------");
		System.out.println(b.getBid()+" "+b.getBtitle()+" "+b.getBauthor()+" "+b.getBcategory()+" "+b.getPrice()+" "+b.getYear());
		session.close();
	}catch(Exception c) {	//exception handling
		System.out.println("Not found");	//print the line
	}
	}
}