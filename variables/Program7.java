class Program7
{
	
	public static void main(String[] args)
	{
		int x=34;
		System.out.println(x);
		{
			int y=60;
			System.out.println(y);
			System.out.println(x);
		}
		System.out.println(x);
		//System.out.println(y);y can't be accessed outside the block
	}
	//System.out.println(x);x can't be accessed outside the block
}