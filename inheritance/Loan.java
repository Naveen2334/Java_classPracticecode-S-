package inheritance;

public class Loan extends SavingsAccount{
	int loannumber;
	double loanamount;
	Loan()
	{
		
	}
	Loan(String bname, String ifsc, String cusname, int accnumber, double balance, int loannumber, double loanamount)
	{
		super(bname, ifsc, cusname,accnumber, balance);
		this.loannumber=loannumber;
		this.loanamount=loanamount;
	}
	public void displayLoan()
	{
		super.displaySavingsAccount();
		System.out.println("Loan Number is: "+loannumber);
		System.out.println("Loan AMount is: "+loanamount);
	}

}
