package file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enbter the Sting: ");
		String s1=sc.nextLine();
		try {
			FileWriter fw1=new FileWriter("d:\\java.txt");
			fw1.write(s1);
			fw1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
