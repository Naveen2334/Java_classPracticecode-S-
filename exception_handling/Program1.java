package exception_handling;

import java.io.FileInputStream;

public class Program1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(12+45+100);
		System.out.println(10/0);
		System.out.println(12+40*2);
		System.out.println("Program ends");
		System.out.println("Thank You");
		
		FileInputStream fis=new FileInputStream("d:\\java.txt");
	}

}
