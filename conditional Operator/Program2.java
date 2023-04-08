import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st side: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd side: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd side: ");
		int c=sc.nextInt();

		String x=(a+b>c && b+c>a && a+c>b)?"Valid Triangle":"Not a valid Triangle";	
	  	System.out.println(x);
	}
}