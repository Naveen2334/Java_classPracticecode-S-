import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Marks for Mathematics: ");
		double a=sc.nextDouble();
		System.out.println("ENter the Marks for Science: ");
		double b=sc.nextDouble();
		System.out.println("ENter the Marks for Social: ");
		double c=sc.nextDouble();
		System.out.println("ENter the Marks for English: ");
		double d=sc.nextDouble();
		System.out.println("ENter the Marks for Hindi: ");
		double e=sc.nextDouble();

		double perMarks=(a+b+c+d+e)*100/500;
		System.out.println("Your Percentage is: "+perMarks+"%");
		
		if(perMarks>=90)
		{
			System.out.println("You are A++ Grade");
		}
		else if(perMarks>=70)
		{
			System.out.println("You are A+ Grade");
		}
		else if(perMarks>=60)
		{
			System.out.println("You are first class");
		}
		else if(perMarks>=40)
		{
			System.out.println("You are Second class");
		}
		else
		{
			System.out.println("Murkh Jao Padho ....fail Ho gaye!!");
		}
	}
}











