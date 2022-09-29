package com.onetomanylab.daoimpl;
/*
 *@author Arnab Kumar Hoodati 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onetomanylab.config.HibernateUtil;
import com.onetomanylab.dao.UniversityDao;
import com.onetomanylab.entity.Students;
import com.onetomanylab.entity.University;

//class implements with interface
public class UniversityDaoImpl implements UniversityDao {
	//create a object from HibernateUtil
	Session session = HibernateUtil.getSessionFactory().openSession();
	//Begin a unit of work and return the associated Transaction object
	Transaction t = session.beginTransaction();

	@SuppressWarnings("deprecation")
	@Override
	public void addUniversity() {	//creating method for adding data in DB
		//OneToMany
		//creating object of University class
		University u = new University();	
		//set the value 
		u.setUname("University Of Calcutta");
		u.setUcity("Kolkata");
		u.setUemail("caluniv@cu.com");
		//creating object of student class
		Students s = new Students();
		//set the value 
		s.setSid(1);
		s.setSname("Arnab");
		s.setAddress("Amtala");
		s.setDept("Chem");
		s.setSphone(987654321);
		s.setEmail("arnab@gmail.com");
		//creating object of student class
		Students s1 = new Students();
		//set the value 
		s1.setSid(2);
		s1.setSname("Rohit");
		s1.setAddress("Dumdum");
		s1.setDept("Math");
		s1.setSphone(897546324);
		s1.setEmail("rohit@gmail.com");
		//creating object of student class
		Students s2 = new Students();
		//set the value 
		s2.setSid(3);
		s2.setSname("Sourav");
		s2.setAddress("Behala");
		s2.setDept("Phys");
		s2.setSphone(948756984);
		s2.setEmail("sourav@gmail.com");
		//creating object of student class
		Students s3 = new Students();
		//set the value 
		s3.setSid(4);
		s3.setSname("Rahul");
		s3.setAddress("Tollygaunge");
		s3.setDept("Comp");
		s3.setSphone(789459658);
		s3.setEmail("rahul@gmail.com");
		//creating array list
		List<Students> sl = new ArrayList<Students>();
		//adding object to array list
		sl.add(s);
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		//adding student in university
		u.setStudents(sl);
		//data saving in DB
		session.save(u);
		//permanently saved
		t.commit();
		System.out.println("inserted succesfully...");	//print the line
		
	}

	@Override
	public void fetchUniversity() {	//creating method for reading data in DB
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		//print the line
		System.out.println("Enter university id : ");
		int uid = sc.nextInt();	//user input for id
		//fetch university data by id
		University u1 = session.get(University.class, uid);
		System.out.println(u1);	//printing the data of university
		
	}

}
