package exception_handling;
public class Program15 {
	public static void main(String[] args)  {
		try {
		printPattern();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
	public static void printPattern() throws InterruptedException, ArithmeticException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(2400);
		}
	}

}
