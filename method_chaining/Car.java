package method_chaining;

public class Car {
	String name;
	int price;
	String color;
	public static Car obj()
	{
		return new Car();
	}
	
	public Car setValue(String name, int price, String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		return this;
	}
	public Car displayCar()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Color is: "+color);
		System.out.println("==================");
		return this;
	}

}
