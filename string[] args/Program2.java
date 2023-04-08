class Program2
{
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		int x=Integer.parseInt(args[0]);
		if(checkPrime(x))
		{
			System.out.println("This is a prime number");	
		}
		else
		{
			System.out.println("This is not a prime number");
		}
	}
	public static boolean checkPrime(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
	if(count==0)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
}