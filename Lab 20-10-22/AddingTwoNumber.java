package Lab;
/*
 * @author Arnab Kumar Hoodati
 */

public class AddingTwoNumber {
		
		//declare instances variables
		int arr[]= {2,4,6,5,3};
		int target=11;
		public String calculate() {	//creating a method
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if (arr[i]+arr[j]==target){//if arr[i]+arr[j]==target then return indexof arr[i ] and arr[j]
						
						return i+","+j;
					}
				}
			}
			return null;
		}
		public static void main(String[] args) {	//main method
			AddingTwoNumber a = new AddingTwoNumber(); //creating object of the class
			System.out.println(a.calculate()); //calling the value

		}

	}

