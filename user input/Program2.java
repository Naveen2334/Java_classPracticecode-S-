import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st number:");
		double a=sc.nextDouble();
		System.out.println("ENter the 2nd number:");
		double b=sc.nextDouble();
		double c=a+b;
		
		System.out.println("The sum is: "+c);	
	}
}