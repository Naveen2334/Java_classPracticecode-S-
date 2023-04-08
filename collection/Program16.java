package collection;
import java.util.*;
public class Program16 {
	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add(12);
		hs1.add(57);
		hs1.add(15);
		hs1.add(12);
		hs1.add(546);
		hs1.add(57);
		System.out.println(hs1);
		System.out.println("=============");
		for(Object x:hs1)
		{
			System.out.println(x);
		}
		
	}

}
