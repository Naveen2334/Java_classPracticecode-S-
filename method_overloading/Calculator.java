package method_overloading;
public class Calculator {
	public static void main(String[] args) {
		sum(12, 56, 78, 88);
		sum(12.6, 67.4);
		sum(12.6, 78);
		sum(12, 43);
		sum(45, 67.4);
		Calculator.sum(12.5, 67.8);
	}
	public static void sum(int a, int b)
	{
		System.out.println();
		System.out.println("Two args int, int method");
		System.out.println("The sum is: "+(a+b));
	}
	public static void sum(int a, int b, int c)
	{
		System.out.println("Three args int, int, int method");
		System.out.println("The sum is: "+(a+b+c));
	}
	public static void sum(int a, int b, int c, int d)
	{
		System.out.println("Four args int, int, int , int method");
		System.out.println("The sum is: "+(a+b+c+d));
	}
	public static void sum(double a, int b)
	{
		System.out.println("Two args double, int method");
		System.out.println("The sum is: "+(a+b));
	}
	public static void sum(double a, double b)
	{
		System.out.println("Two args double, double method");
		System.out.println("The sum is: "+(a+b));
	}

}
