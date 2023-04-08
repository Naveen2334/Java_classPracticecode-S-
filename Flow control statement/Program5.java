import java.util.Scanner;
class Program5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the CP: ");
		double cp=sc.nextDouble();
		System.out.println("ENter the SP: ");
		double sp=sc.nextDouble();
		
		if(sp>cp)
		{
			System.out.println("You have profit");
			double profit=sp-cp;
			double perProfit=(profit*100)/cp;
			System.out.println("The Profit% is: "+perProfit+"%");
		}
		else if(cp>sp)
		{
			System.out.println("You have Loss");
			double loss=cp-sp;
			double perLoss=(loss*100)/cp;
			System.out.println("The Loss% is: "+perLoss+"%");
		}
		else
		{
			System.out.println("There is no profit no loss in the transaction ");
		}
		
	}
}











