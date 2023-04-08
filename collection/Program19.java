package collection;
import java.util.*;
public class Program19 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("mohan");
		a1.add("Foxy");
		a1.add("Mohan");
		a1.add("Pankaj");
		a1.add("Fox");
		System.out.println(a1);
		
		TreeSet t1=new TreeSet(a1);
		System.out.println(t1);
		
	}

}
