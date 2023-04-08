import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the caharacter: ");
		char x=sc.next().charAt(0);
		

		String y=(x>='a' && x<='z')?"Lower case alphabet":"Not a lower case alphabet";	
	  	System.out.println(y);
	}
}