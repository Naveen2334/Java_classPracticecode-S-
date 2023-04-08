import java.util.Scanner;
class Program12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			while(j<=10)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}
			System.out.println("====================");
			i++;	
		}
		
		
	}
}