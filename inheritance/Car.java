package inheritance;

public class Car extends Vehicle{
	int x=60;
	
	public void demo()
	{
		System.out.println("This is demo method");
		int x=80;
		System.out.println("Local x from demo is: "+x);
		System.out.println("GLobal x from Car is: "+this.x);
		System.out.println("Global x from Vehicle is: "+super.x);
		test();
		super.test();
	}

}
