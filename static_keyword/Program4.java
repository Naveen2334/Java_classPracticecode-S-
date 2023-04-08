package static_keyword;
public class Program4 {
	static int i=12;
	static int j;
	public static void main(String[] args) {
		System.out.println("Main method "+i+"   "+j+"  "+k);
		int i=46;
		System.out.println(i+"   "+j);
		j=70;
		System.out.println(i+"   "+j);
		test();
		System.out.println(i+"   "+j);
	}
	public static void test() {
		System.out.println("from test method: "+i+"   "+j+"  "+k);
		int i=45;
		j=60;
		System.out.println(i+"   "+j);
		
	}
	static int k=67;
}
