import java.util.Scanner;
class Program10
{
	public static void main(String[] args)
	{
		int i=1;
		int count=0;
		
		while(i<=1000)
		{
			if(i%7==0 && i%10==7)
			{
				count++;
				System.out.print(i+"   ");
			}
		i++;
		}
		System.out.println("\n"+"Total such numbers are: "+count);

		
	}
}