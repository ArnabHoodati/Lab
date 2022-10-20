package Lab;
/*
 * @author Arnab Kumar Hoodati
 */

import java.io.FileReader;
import java.io.FileWriter;

public class FileInput {

	public static void main(String[] args) //main method
	{
		String s = "Good food good life"; //declare a string variable

		try {
			// Attach a file to FileWriter
			FileWriter fw = new FileWriter("D:\\Document\\FileInputText.txt");
			fw.write(s); 
			fw.close(); // close the file of write
			//print the line
			System.out.println("File created... ");
			System.out.println("Content:");
			// Attach a file to FileReader
			FileReader fr =new FileReader("D:\\Document\\FileInputText.txt");
			 int i;
			//condition for reading file; if there is nothing in the file it will return '-1'
	            while ((i = fr.read()) != -1) {
	                System.out.print((char) i);//printing file content
	            }
			fr.close();	 // close the file of read
		}
		//exception handling
		catch (Exception e) {
			System.out.print(e);
		}
	}
}

