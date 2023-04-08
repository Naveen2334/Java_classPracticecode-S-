package static_keyword;

public class Employ{
	static int i=15;
	int j=45;
	
	public static void main(String[] args) {
		System.out.println(i);
		
		System.out.println("========Obje ref======");
		Employ e1=new Employ();
		System.out.println(e1.i);
	}
	

}
