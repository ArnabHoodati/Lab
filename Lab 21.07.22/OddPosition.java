package Array;
/*
@author: Arnab Kumar Hoodati
*/
public class OddPosition {
	public static void main(String[] args) {  
        int [] a = new int [] {1, 2, 3, 4, 5};   //declaration, initialization and instantiation
        System.out.println("Elements of the array which are present in odd positions:");  //Print the Line
        for (int i = 0; i < a.length; i = i+2) {   //logic to fine odd position
            System.out.println(a[i]);   //print elements
        }    
    }  
}  

