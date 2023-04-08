class Program5
{
	
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		findPower();
		findPower();
		findPower();
		Program4.findFactorial();
		System.out.println("Main method end");	
			
	}
	public static void findPower()
	{
		int a=12;
		int b=4;
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		System.out.println(a+" to power "+b+" is: "+pow);
	}	
}