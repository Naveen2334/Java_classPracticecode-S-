package non_static_block;

public class Employ {
	
	{
		System.out.println("This is non_static block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		Employ e1=new Employ();
		System.out.println("================");
		Employ e2=new Employ();
		System.out.println("=================");
		Employ e3=new Employ();
	}
	
	
	{
		System.out.println("This is non_static block-2");
	}

}
