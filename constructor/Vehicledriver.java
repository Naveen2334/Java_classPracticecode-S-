package constructor;

public class Vehicledriver {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle("Bus", 346457, "Blue");
		v1.displayVehicle();
		Vehicle v2=new Vehicle("Car", 77889, "Red");
		v2.displayVehicle();
		Vehicle v3=new Vehicle("Bike", 57568, "Pink");
		v3.displayVehicle();
		
		Vehicle v4=new Vehicle();
		v4.displayVehicle();
		
		Vehicle v5=new Vehicle("ElectricCar");
		v5.displayVehicle();
		
		Vehicle v6=new Vehicle("CNG CAr", 586568.7);
		v6.displayVehicle();
		
		System.out.println(v1.getClass());
	}

}
