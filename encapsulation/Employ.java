package encapsulation;
import java.util.*;
public class Employ {
	private int pwd=12345;
	private String name;
	private int eid;
	private double salary;
	
	Employ()
	{
	}
	public String cat() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password: ");
		int x=sc.nextInt();
		if(pwd==x)
		{
			System.out.println("Password validation is successful");
			return name;
		}
		else
		{
			System.out.println("Password is Invalid");
			return null;
		}
	}
	public void setName(String name) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password: ");
		int x=sc.nextInt();
		if(pwd==x)
		{
			System.out.println("Password validation is successful and name is set");
			this.name = name;
		}
		else
		{
			System.out.println("Password is Invalid and name is not set");
		}
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
