package method_chaining;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.setValue("Maruti", 346457, "White").displayCar();
		
		Car c2=new Car();
		c2.setValue("Audi", 996457, "Red").displayCar();
		
		
		
		Car.obj().setValue("Honda", 457547, "Black").displayCar();
		
		
		Car p=Car.obj();
		p.setValue("Hyundai", 34657, "Silver").displayCar();
		
		
		
	}

}
