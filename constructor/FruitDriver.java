package constructor;
public class FruitDriver {
	public static void main(String[] args) {
		Fruit f1=new Fruit("Mango", 120, 3.6);
		f1.displayFruit();
		
		Fruit f2=new Fruit(f1);
		f2.displayFruit();
		
		Fruit f3=new Fruit("Apple", 180);
		f3.displayFruit();
		
		Fruit f4=new Fruit(f3);
		f4.displayFruit();
		
		Fruit f5=new Fruit(f2, 4.5);
		f5.displayFruit();
		
	}

}
