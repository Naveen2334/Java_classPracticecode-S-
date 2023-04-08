class Program1
{
	public static void main(String[] args)
	{
		System.out.println("This is main method");	
		System.out.println(args[0]);	
		System.out.println(args[1]);	
		System.out.println(args[2]);	
		System.out.println(args[3]);
		System.out.println(args[0]+args[1]+100);
		int p=Integer.parseInt(args[0]);
		int q=Integer.parseInt(args[1]);	
		System.out.println(p+q+100);

		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1])+100);	
	}
	
}