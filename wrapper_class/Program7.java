package wrapper_class;
import java.math.BigInteger;
public class Program7 {
	public static void main(String[] args) {
		BigInteger b1=new BigInteger("546789769780890867876867897689797979797979");
		System.out.println(b1);
		BigInteger b2=new BigInteger("658776897697809");
		System.out.println(b1.add(b2));
		System.out.println("Product: "+b1.multiply(b2));
		System.out.println();
		
		System.out.println(b1.compareTo(b2));
	}

}
