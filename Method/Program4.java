class Program4
{
	
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		findFactorial();
		findFactorial();
		findFactorial();
		findFactorial();
		System.out.println("Main method end");	
			
	}
	public static void findFactorial()
	{
		int n=9;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!= "+fact);
	}	
}