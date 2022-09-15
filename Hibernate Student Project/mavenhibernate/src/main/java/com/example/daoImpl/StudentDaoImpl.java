package com.example.daoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtill;
import com.example.dao.StudentDao;
import com.example.entity.Student;

public class StudentDaoImpl implements StudentDao {		

	public void addStudent() {	
		Scanner sc = new Scanner(System.in);	//creating scanner object
		//declare variables
		String n,d,e;
		long p;
		//user input
		System.out.println("Enter name : ");
		n = sc.nextLine();
		System.out.println("Enter Department : ");
		d = sc.nextLine();
		System.out.println("Enter email : ");
		e = sc.nextLine();
		System.out.println("Enter phone number : ");
		p = sc.nextLong();
		
		Student s = new Student();	//creating object of student class
		//set all data
		s.setName(n);
		s.setDept(d);
		s.setEmail(e);
		s.setPhone(p);
		//Get the session factory which created this session & check if the session is still open.
		Session session =  HibernateUtill.getSessionFactory().openSession();
		//Begin a unit of work and return the associated Transaction object
		Transaction t = session.beginTransaction();
		session.save(s);
		t.commit();
	}

	public void deleteStudent() {
		

	}

	public void updateStudent() {
		

	}

	public void fetchStudent() {	
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.println("Enter id : ");
		id = sc.nextInt();
		Session session =  HibernateUtill.getSessionFactory().openSession();
		Student s1 = session.get(Student.class, id);
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getDept()+" "+s1.getEmail()+" "+s1.getPhone());
	}

}
