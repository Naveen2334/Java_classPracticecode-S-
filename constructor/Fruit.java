package constructor;
public class Fruit {
	String name;
	int price;
	double weight;
	Fruit()
	{
		System.out.println("Fruit object is created");
	}
	Fruit(String name)
	{
		this();
		this.name=name;
	}
	Fruit(String name, int price)
	{
		this(name);
		this.price=price;
	}
	Fruit(String name, int price, double weight)
	{
		this(name, price);
		this.weight=weight;
	}
	Fruit(Fruit x)
	{
		this.name=x.name;
		this.price=x.price;
		this.weight=x.weight;
	}
	Fruit(Fruit x, double weight)
	{
		this.name=x.name;
		this.price=x.price;
		this.weight=weight;
	}
	public void displayFruit()
	{
		System.out.println("name is: "+name);
		System.out.println("price is: "+price+"Rs/Kg");
		System.out.println("weight is: "+weight+"KG");
		System.out.println("You have to pay :"+price*weight);
		System.out.println("===================");
	}

}
