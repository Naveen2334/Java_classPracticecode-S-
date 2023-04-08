import java.util.Scanner;
class Program5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char x=sc.next().charAt(0);
	
		switch(x)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println("This is a vowel");
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				System.out.println("This is a number Character");
				break;
				
			default:
				System.out.println("This is other character");
		}
	}
}





