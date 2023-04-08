package inheritance;
public class Bank {
	String bname;
	String ifsc;
	Bank()
	{	
	}
	Bank(String bname, String ifsc)
	{
		this.bname=bname;
		this.ifsc=ifsc;
	}
	public void displayBank()
	{
		System.out.println("Bank Name is: "+bname);
		System.out.println("Bank IFSC is: "+ifsc);
	}
	

}
