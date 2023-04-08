package inheritance;

public class VehicleDriver {
	public static void main(String[] args) {
		System.out.println("=======Parent ref==========");
		Vehicle v1=new Vehicle();
		v1.test();
		System.out.println("==========child ref=========");
		Car c1=new Car();
		c1.demo();
		
	}

}
