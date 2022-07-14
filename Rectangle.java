/*
 * @author Arnab Kumar Hoodati
 * 
 * Encapsulation
 * 
 */

class Rectangle {
	private int length, width;

	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	void run(){
		System.out.println("Area of the rectangle is: "+length*width);
	}
	public void setlengtha(int length){		//setter method
		this.length=length;
	}
	public void setwidth(int width){
		this.width=width;
	}
}
public class RectangleTest{
	public static void main (String[] args){
		Rectangle obj = new Rectangle(40,20);	//creating object of Rectangale class
		
		obj.run();
		obj.setlengtha(45);
		obj.setwidth(20);
		obj.run();
	}
}
	