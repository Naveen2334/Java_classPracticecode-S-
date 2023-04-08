import java.util.Scanner;
class Program6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		double a=sc.nextDouble();
		System.out.println("ENter b: ");
		double b=sc.nextDouble();
		System.out.println("ENter c: ");
		double c=sc.nextDouble();

		double d=b*b-4*a*c;
		
		if(d>=0)
		{
			System.out.println("Real Roots are Possible");
			double x1=(-b+Math.sqrt(d))/(2*a);
			double x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The 1st root is: "+x1);
			System.out.println("The 2nd root is: "+x2);
		}
		else
		{
			System.out.println("Real roots are not possible");
			
		}
	}
}











