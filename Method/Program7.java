class Program7
{
	
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		findPower(12, 4);
		findPower(16, 3);
		findPower(9, 5);
		Program6.findFactorial(9);
		System.out.println("Main method end");	
			
	}
	public static void findPower(int a,int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		System.out.println(a+" to power "+b+" is: "+pow);
	}	
}