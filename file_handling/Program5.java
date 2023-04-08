package file_handling;
import java.io.*;
import java.util.*;
public class Program5 {
	public static void main(String[] args) {
		File f1=new File("d:\\Program3.java");
		
		try {
			Scanner sc=new Scanner(f1);
			while(sc.hasNextLine())
			{
				String p=sc.nextLine();
				System.out.println(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
