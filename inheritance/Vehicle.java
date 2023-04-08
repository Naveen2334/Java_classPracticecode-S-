package inheritance;

public class Vehicle {
	int x=10;
	
	
	public void test()
	{
		System.out.println("Inside test method");
		int x=20;
		System.out.println("Local x of test() is: "+x);
		System.out.println("Global x of vehicle is: "+this.x);
	}

}
