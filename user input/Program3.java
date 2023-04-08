import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st number:");
		int a=sc.nextInt();
		System.out.println("ENter the 2nd number:");
		double b=sc.nextDouble();
		double c=a+b;
		
		System.out.println("The sum is: "+c);	
	}
}