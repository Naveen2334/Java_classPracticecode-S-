package inheritance;

public class ABDriver{
	public static void main(String[] args) {
		System.out.println("=======Parent ref===============");
		A a=new A();
		System.out.println(a.x);
		a.test();
		System.out.println("==========child ref===========");
		B b=new B();
		System.out.println(b.p);
		System.out.println(b.x);
		b.test();
		b.demo();
	}

}
