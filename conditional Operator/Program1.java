import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		String x=(n%2==0)?"Enterd no. is Even":"Enterd no. is Odd";	
	  	System.out.println(x);
	}
}