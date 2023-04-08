import java.util.Scanner;
class Program7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Item price: ");
		double a=sc.nextDouble();
		System.out.println("ENter 2nd Item price: ");
		double b=sc.nextDouble();
		System.out.println("ENter 3rd Item price: ");
		double c=sc.nextDouble();
		
		double total=a+b+c;
		System.out.println("Total Price of the items is: "+total);
		
		if(total>=5000)
		{
			double disPrice=total*0.75;
			System.out.println("You have to Pay: "+disPrice);	
		}
		else if(total<=4999 && total>=3000)
		{
			double disPrice=total*0.92;
			System.out.println("You have to Pay: "+disPrice);	
		}
		else
		{
			System.out.println("You have to Pay: "+total);
		}
	}
}











