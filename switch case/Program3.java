import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b=sc.nextInt();
		System.out.println("Enter the Operation(+,-,*,/ or %) You want to perform: ");
		char x=sc.next().charAt(0);
	
		switch(x)
		{
			case '+':
				System.out.println("The sum is: "+(a+b));
				break;
			case '-':
				System.out.println("The difference is: "+(a-b));
				break;
			case '*':
				System.out.println("The Product is: "+(a*b));
				break;
			case '/':
				System.out.println("The quotient is: "+(a/b));
				break;
			case '%':
				System.out.println("The remainder is: "+(a%b));
				break;
				
			default:
				System.out.println("This is not a valid Operation");
		}
	}
}





