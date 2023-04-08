package exception_handling;
import java.io.*;
public class Program5 {
	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			FileInputStream fis=new FileInputStream("d:\\java.txt");
			System.out.println("File Found");
		}
		catch(Exception e)
		{
			System.out.println("File Not Found");
			System.out.println("How to store input please define");
		}
		System.out.println("Program ends");
	}

}
