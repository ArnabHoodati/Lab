package Lab;
/*
 * @author Arnab Kumar Hoodati
 */

import java.util.Scanner;

public class Movie {
	//declare instances variable
	String movieName, movieStartTime, movieEndTime;
	double movieTicketPrice;
	//creating scanner class object
	Scanner sc = new Scanner(System.in);
	public void addMovie() {
		//taking value from user input
		System.out.println("Enter movie name : ");
		String movieName = sc.next();	
		System.out.println("Enter movie starting time : ");
		String movieStartTime = sc.next();
		System.out.println("Enter movie ending time : ");
		String movieEndTime = sc.next();
		System.out.println("Enter movie ticket price : ");
		int movieTicketPrice = sc.nextInt();
		//generating constructor
		this.movieName=movieName;
		this.movieTicketPrice=movieTicketPrice;
		this.movieStartTime=movieStartTime;
		this.movieEndTime=movieEndTime;
		System.out.println("Movie added succesfully");
		
	}

		@Override
		public String toString() {	//generating toString
			return "Movie [movieName=" + movieName + ", movieTicketPrice=" + movieTicketPrice + ", movieStartTime="
					+ movieStartTime + ", movieEndTime=" + movieEndTime+"]";
	}
		public static void main(String[] args) {	//main method
			Movie movie = new Movie();
			movie.addMovie();  //calling  method
			System.out.println(movie.toString());//printing values calling toSting()

		}

	
	

}
