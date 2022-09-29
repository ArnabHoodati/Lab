package com.onetomanylab;
/*
 *@author Arnab Kumar Hoodati 
 * 
 */
import com.onetomanylab.daoimpl.UniversityDaoImpl;

public class App 
{
    public static void main( String[] args )
    {	
    	//creating object of daoimpl class
        UniversityDaoImpl udao = new UniversityDaoImpl();
        udao.addUniversity();	//call the method for adding data
        udao.fetchUniversity();	//call the method for read data
    }
}
