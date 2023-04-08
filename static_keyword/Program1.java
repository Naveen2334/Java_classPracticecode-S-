package static_keyword;

public class Program1 {
	static int a=24;
	public static void main(String[] args) {
		System.out.println(a);//global
		a=35;//global
		System.out.println(a);//global
		int a=58;//local
		System.out.println(a);//local
		a=65;//local
		System.out.println(a);//local
		
		System.out.println(Program1.a);//global ...class name used to
		//overcome variable hiding
		Program1.a=900;//global
		System.out.println(a);//local
		System.out.println(Program1.a);//global
		
	}

}
