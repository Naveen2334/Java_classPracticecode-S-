class Program4
{
	public static void main(String[] args)
	{
		int x=16;
		int y= ++x;
		x++;
		--y;
		int z= x++ - --y;
		int p= ++x + ++y - --z;
		
		
	  	System.out.println(x); 
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
		
		
		
	}
}