package Array;
/*
@author: Arnab Kumar Hoodati
*/
public class DuplicateValue {
	public static void main (String[] args) {  
        int [] a = new int [] {5,2,7,7,5};   //declaration, initialization and instantiation of array 
        System.out.println("Duplicate values of an array of integer values: ");  //Print the line
        //Logic to find and print duplicates
        for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    System.out.println(a[j]);  //Print value which are duplicate
            }  
        }  
    }  
}
