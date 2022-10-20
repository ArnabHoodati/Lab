package Lab.customer;
/*
 * @author Arnab Kumar Hoodati
 */

class Customer {
	
	int accountNumber;
	String accountName;
	double accountBalance;
	//create a method for account create
	public void createAccount(int accountNumber,String accountName,double accountBalance) {
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.accountBalance=accountBalance;
		System.out.println("Account created successfully...");
		
	}
	//create a method for balance deposit
	public void setAmount(int amount) {
		double depositamount  = amount+accountBalance; //logic
		System.out.println("Balance deposit successfull " + " \nYour current balance is : "+depositamount);
		this.accountBalance=depositamount;
	}
	//create a method for balance withdrawn
	public void withDrawAmount(int withDrawAmount) {
		double withdrawlamount=accountBalance-withDrawAmount; //logic
		System.out.println("Balance withdrawl successfull" + "\nYour current balance is : "+withdrawlamount);
		this.accountBalance=withdrawlamount;//logic
	
	}
	//create a method for printing the balance
	public void getAmount() {
		System.out.println("Hello "+ accountName+" your account balanace is "+accountBalance);
		
	}
	
	public static void main(String[] args) {
		//adding 1st customer
		Customer c1=new Customer();
		c1.createAccount(12345, "Arnab", 5000);
		c1.setAmount(10000);
		c1.withDrawAmount(1000);
		c1.getAmount();
		System.out.println("----------------------------------------------------");
		//adding 2nd customer
		Customer c2=new Customer();
		c2.createAccount(3214, "Rohit", 1000);
		c2.setAmount(5000);
		c2.withDrawAmount(500);
		c2.getAmount();
		

	}
}
