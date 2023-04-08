import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the caharacter: ");
		char x=sc.next().charAt(0);
		
		if(x>='a' && x<='z')
		{
			System.out.println("This is a lower case alphabet");
		}
		else
		{
			System.out.println("This is not a lower case alphabet");
		}
		
		  
	}
}