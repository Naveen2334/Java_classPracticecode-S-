package has_a_relationship;
public class Car {
	String name;
	double price;
	Engine e=new Engine(60, 6, "diesel");
	Car()
	{	
	}
	Car(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	Car(String name, double price, Engine e)
	{
		this.name=name;
		this.price=price;
		this.e=e;
	}
	public void displayCar()
	{
		System.out.println("Name of car is: "+name);
		System.out.println("Price of car is: "+price);
		e.displayEngine();
		/*System.out.println("Car engine hp: "+e.hp);
		System.out.println("car engine strokes is: "+e.strokes);
		System.out.println("Car engine type is: "+e.type);*/
	}
	

}










