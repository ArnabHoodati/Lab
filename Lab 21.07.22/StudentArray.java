package Array;
/*
@author: Arnab Kumar Hoodati
*/
public class StudentArray {	//Parent/Base class
	//Instance Variable
	int StudentNo, fees;
	String StudentName;
	String MailId;
	String Address;
	//creating parameterized constructor
	public StudentArray(int StudentNo, String StudentName, String MailId, String Address) {	
		this.StudentNo=StudentNo;
		this.StudentName=StudentName;
		this.MailId=MailId;
		this.Address=Address;
	}
	void fees(int fees) {	//Method for initializing Student's fees
		
		//if the fees are less than 2000 then fees will increase by 
		//10% of their current fees to that Student.
		if(fees<2000) {
			fees+=10*fees/100;	//logic for increasing fees
		}
		this.fees=fees;
	}
	void display() {	//Method for Displaying Output
		System.out.println("Student No: "+StudentNo+ ", Student Name:" +StudentName+ ", Student Mail Id: "+MailId+
							", Student Address: "+Address+ ", Student Fees: "+fees);
		}
	}
class StudentArray1 {
	public static void main(String[] args) {	//Main Method
		StudentArray s[] = new StudentArray[5];	//creating object for base class
		//Array of 5 Students
		s[0] = new StudentArray(111,"Student1","Student1@gmail.com","Address1");
		s[1] = new StudentArray(112,"Student2","Student2@gmail.com","Address2");
		s[2] = new StudentArray(113,"Student3","Student3@gmail.com","Address3");
		s[3] = new StudentArray(114,"Student4","Student4@gmail.com","Address4");
		s[4] = new StudentArray(115,"Student5","Student5@gmail.com","Address5");
		//Assign different fees to each Student 
		s[0].fees(2500);
		s[1].fees(1600);
		s[2].fees(3500);
		s[3].fees(1100);
		s[4].fees(3000);
		
		for(int i=0; i<s.length; i++) {	//loop
		s[i].display();	//Call the display method to print the updated details
		}
	}
}

