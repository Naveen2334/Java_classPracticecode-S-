package inheritance;

public class BankDriver {
	public static void main(String[] args) {
		Bank b1=new Bank("HDFC", "HDFC00012");
		b1.displayBank();
		System.out.println("==================");
		SavingsAccount s1=new SavingsAccount("ICICI", "ICICI00022", "Mohan", 10000876,97987868.78);
		s1.displaySavingsAccount();
		System.out.println("======================");
		Loan l1=new Loan("SBI After Lunch", "SBI00023", "Sohan", 100996,9756768.78, 1111267, 120000);
		l1.displayLoan();
		
		
	}

}
