package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Progarm8 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(68);
		c1.add(67);
		c1.add(197);
		c1.add(68);
		System.out.println(c1);
		System.out.println("================");
		for(Object x:c1)
		{
			System.out.println(x);
		}
	}

}
