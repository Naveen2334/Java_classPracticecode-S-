package exception_handling;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1=new Employ();
		System.out.println(e1.name);
		e1.name="Mohan";
		System.out.println(e1.name);
		e1=null;
		System.out.println(e1.name);
		System.out.println("Program ends");
	}

}
