package interface_part;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v1=new ElectricCar();
		v1.start();
		v1.drive();
		
		Car c1=new ElectricCar();
		c1.start();
		c1.drive();
		c1.accelerate();
		
	}

}
