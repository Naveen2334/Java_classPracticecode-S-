package exception_handling;
import java.util.*;
public class RegistrationPortal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		try
		{
		checkEligiblity(age);
		}
		catch(UnderAgeException e)
		{
			System.out.println("You are UnderAge");
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public static void checkEligiblity(int age) throws UnderAgeException
	{
		if(age>=18)
		{
			System.out.println("You are eligible to Register");
		}
		else
		{
			throw new UnderAgeException();
		}
		
	}

}
