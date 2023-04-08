package inheritance;
public class SavingsAccount extends Bank {
	String cusname;
	int accnumber;
	double balance;
	SavingsAccount()
	{
		
	}
	SavingsAccount(String bname, String ifsc, String cusname, int accnumber, double balance)
	{
		//this.bname=bname;
		//super.bname=bname;
		super(bname, ifsc);
		this.cusname=cusname;
		this.accnumber=accnumber;
		this.balance=balance;
	}
	public void displaySavingsAccount()
	{
		super.displayBank();
		System.out.println("Customer name is: "+cusname);
		System.out.println("Customer account number is: "+accnumber);
		System.out.println("Customer balance is: "+balance);
	}
	

}











