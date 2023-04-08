package constructor;
public class Vehicle {
	static int count=0;
	String name;
	double price;
	String color;
	int hp;
	Vehicle() {
		System.out.println("Vehicle Object is created");
	}
	Vehicle(String name)
	{
		this();
		this.name=name;
	}
	Vehicle(String name, double price)
	{
		this(name);
		this.price=price;
	}
	
	Vehicle(String name, double price, String color)
	{
		this(name, price);
		count++;
		System.out.println("Vehicle "+count+" is created");
		
		this.color=color;
	}
	Vehicle(String name, double price, String color, int hp)
	{
		this(name, price, color);
		this.hp=hp;
	}
	public void displayVehicle()
	{
		System.out.println("name is: "+this.name);
		System.out.println("Price is: "+this.price);
		System.out.println("COlor is: "+color);
		System.out.println("=================");
	}

}
