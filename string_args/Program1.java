package string_args;

public class Program1 {
	public static void main(String[] args) {
		test(null);
		int[] p= {45, 67, 76987, 6876, 687678};
		test(p);
		System.out.println(args[0]);	
		System.out.println(args[1]);	
		System.out.println(args[2]);	
		System.out.println(args[3]);
		System.out.println(args[0]+args[1]+100);
		int x=Integer.parseInt(args[0]);
		int q=Integer.parseInt(args[1]);	
		System.out.println(x+q+100);
		
	}
	
	public static void test(int[] a)
	{
		System.out.println("test method");
		
	}

}
