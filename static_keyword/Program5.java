package static_keyword;
public class Program5 {
	static int i=12;
	static int j=test();
	public static void main(String[] args) {
		System.out.println("Main method "+i+"   "+j+"  "+k);
		int i=46;
		System.out.println(i+"   "+j);
		j=70;
		System.out.println(i+"   "+j);
		int p=test();
		System.out.println(i+"   "+j+"   "+p);
	}
	public static int test() {
		System.out.println("from test method: "+i+"   "+j+"  "+k);
		int i=45;
		j=60;
		System.out.println(i+"   "+j);
		return i+40;
	}
	static int k=67;
}