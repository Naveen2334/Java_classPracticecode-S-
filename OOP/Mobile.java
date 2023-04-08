public class Mobile
{
	String name;
	int ram;
	String color;
	public void setValue(String n, int r, String c)
	{
		name=n;
		ram=r;
		color=c;
	}
	public void displayMobile()
	{
		System.out.println("Name is: "+name);
		System.out.println("RAM size is: "+ram+"GB");
		System.out.println("Color is: "+color);
		System.out.println("======================");
	}
}









