import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st number:");
		int a=sc.nextInt();
		System.out.println("ENter the 2nd number:");
		int b=sc.nextInt();
		int c=a+b;
		
		System.out.println("The sum is: "+c);	
	}
}