package collection;
import java.util.*;

public class Program22 {
	public static void main(String[] args) {
		Map<Integer, String> m1=new LinkedHashMap<Integer, String>();
		m1.put(12, "Mohan");
		m1.put(18, "jack");
		m1.put(16, "john");
		m1.put(45, "Mohan");
		
		
		
		m1.put(12, "Jethalal");
		System.out.println(m1);
	}

}
