
class Test
{
	static int x=10;
		int y=23;
	public static void run()
	{
		System.out.println("Static run method");
	}
	public void  demo()
	{
		System.out.println("non-Static demo method");
	}
	public static void main(String[] args)
	{
		
		System.out.println(x);
		run();
		Test t1=new Test();
		System.out.println(t1.y);
		t1.demo();
		System.out.println(t1.x);
		t1.run();
		
	}
}