package this_keyword;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1);
		c1.test();
		
		System.out.println("=========");
		Car c2=new Car();
		System.out.println(c2);
		c2.test();
		System.out.println("===========");
		Car c3=new Car();
		System.out.println(c3);
		c3.test();
		
		c1.test();
		
		
	}

}//c1==this
//this==c1
//this==c2
//this==c3
