class Program6
{
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		findFactorial(9);
		findFactorial(8);
		findFactorial(12);
		findFactorial(13);
		System.out.println("Main method end");			
	}
	public static void findFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!= "+fact);
	}	
}