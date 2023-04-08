package inheritance;

public class B extends A{
	int p=40;
	
	public void demo()
	{
		int q=60;
		System.out.println("demo method");
		System.out.println("sum from demo method is: "+(x+p+q));
		test();
	}

}
