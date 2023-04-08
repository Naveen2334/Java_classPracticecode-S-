import java.util.Scanner;
class Program7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int count=0;
		int i=1;
		while(i<=n/2)
		{
			
			if(n%i==0)
			{
				count++;
				System.out.print(i+"   ");
				
			}
		i++;
		}
		
		System.out.println("\n"+"Total factors are: "+count);
			
	}
}