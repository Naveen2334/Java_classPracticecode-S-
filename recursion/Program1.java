import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		test();
		System.out.println("main method ends");
	}
	public static void test()
	{
		
		System.out.println("This is test method");
		test();
	}
		
}