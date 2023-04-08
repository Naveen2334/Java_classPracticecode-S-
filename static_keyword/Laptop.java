package static_keyword;

public class Laptop {
	public static void main(String[] args) {
		System.out.println("Laptop class ");
		System.out.println("i is: "+Employ.i);
		
		System.out.println("======obj ref====");
		Employ e1=new Employ();
		System.out.println(e1.i);
		System.out.println(e1.j);
		System.out.println("====j after object is null");
		e1=null;
		System.out.println(e1.i);
		System.out.println(e1.j);
		
	}

}
