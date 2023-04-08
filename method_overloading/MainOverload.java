package method_overloading;

public class MainOverload {
	public static void main(String[] args) {
		System.out.println("This main is String[] type");
		main(23.5);
		main(12, 45)
	}
	
	public static void main(int x) {
		System.out.println("This main is int type");
	}
	public static void main(double x) {
		System.out.println("This main is double type");
	}
	
	public static void main(int x, int y) {
		System.out.println("This main is int, int type");
	}

}
