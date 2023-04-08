class Program2
{
	private static void test()
	{
		System.out.println("This is test method");
	}
	public  static  synchronized final void  main(String[] args)
	{
		System.out.println("This is main method");
		demo();
		System.out.println("main method ends");
			
	}
	public static void demo()
	{
		System.out.println("This is demo method");
		test();
		System.out.println("demo method ends");
	}
}