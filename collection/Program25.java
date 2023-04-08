package collection;
import java.util.*;
public class Program25 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(35);
		a1.add(457);
		a1.add(679);
		a1.add(68976);
		a1.add(6);
		
		Iterator p=a1.iterator();
		System.out.println(p.hasNext());
		System.out.println(p.next());
		
		
		System.out.println("=====================");
		while(p.hasNext())
		{
			System.out.println(p.next());
		}
		
	}

}
