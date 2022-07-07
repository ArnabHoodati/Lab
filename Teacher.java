/*
@author: Arnab Kumar Hoodati
*/

class Teacher {      //base class
   String designation = "Teacher";
   String collegeName = "RERF";
   void work(){
	System.out.println("Teaching");
   }
}

public class ITTeacher extends Teacher{   //child class
   String Sub = "Java";
   public static void main(String args[]){
	ITTeacher obj = new ITTeacher();    //create obj of child class
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.Sub);
	obj.work();
   }
}