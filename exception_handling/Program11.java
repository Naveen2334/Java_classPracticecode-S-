package exception_handling;

public class Program11 {
	public static void main(String[] args) {
		try {
			System.out.println(10/2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This is finally block");
		}
	}

}
