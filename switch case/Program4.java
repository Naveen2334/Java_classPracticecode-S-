import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char x=sc.next().charAt(0);
	
		switch(x)
		{
			case 'a':
				System.out.println("This is a vowel");
				break;
			case 'A':
				System.out.println("This is a vowel");
				break;
			case 'e':
				System.out.println("This is a vowel");
				break;
			case 'E':
				System.out.println("This is a vowel");
				break;
			case 'I':
				System.out.println("This is a vowel");
				break;
			case 'i':
				System.out.println("This is a vowel");
				break;
			case 'O':
				System.out.println("This is a vowel");
				break;
			case 'o':
				System.out.println("This is a vowel");
				break;
			case 'U':
				System.out.println("This is a vowel");
				break;
			case 'u':
				System.out.println("This is a vowel");
				break;
				
			default:
				System.out.println("This is other character");
		}
	}
}





