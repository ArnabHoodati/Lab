package Array;
/*
@author: Arnab Kumar Hoodati
*/
public class SpecificValue {
	   public static void main(String args[]){
		 //declaration, initialization and instantiation of array
	      int[] a = {1789,2035,1899,1456,2013};	
	      int value = 2013;		// put value to be checking
	      for(int i = 0; i<a.length; i++){	//logic for checking  
	         if(value == a[i]){		// Check the value its present in the array or not
	        	 //Print the value if its present in the array
	            System.out.println("An array contains a specific value.");
	         }
	      }
	   }
	}