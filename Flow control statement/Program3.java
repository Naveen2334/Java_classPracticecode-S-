import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int x=sc.nextInt();
		
		if(x>0)
		{
			System.out.println("The number is +ve");
		}
		else if(x<0)
		{
			System.out.println("The Number is -Ve");
		}
		else
		{
			System.out.println("The number is Zero");
		}
	}
}