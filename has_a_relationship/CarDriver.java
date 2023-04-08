package has_a_relationship;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("Maruti", 547568.567);
		c1.displayCar();
		System.out.println("===============");
		Car c2=new Car("KIA", 789787.567);
		c2.displayCar();
		System.out.println("=================");
		Car c3=new Car("Honda", 456757.67, new Engine(80, 8,"CNG"));
		c3.displayCar();
		//c3=null;
		//System.out.println(c3.e.hp);
		Engine e1=new Engine(92, 10, "diesel");//address
		Car c4=new Car("TaTa 800", 345634.56, e1);//Student//aggregation
		c4=null;
		System.out.println(e1.hp);
		System.out.println(c4.name);
	}

}
