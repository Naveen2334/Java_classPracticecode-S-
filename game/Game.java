package game;
import java.util.Scanner;
public class Game {

	Weapon pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score=sc.nextInt();
		
		if(score<=500)
		{
			System.out.println("You got the Knife");
			Knife k=new Knife();
			return k;
		}
		else if(score<=1000)
		{
			System.out.println("Press 1 for Knife and 2 for Gun");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:
				System.out.println("You got the knife");
				Knife k2=new Knife();
				return k2;
			case 2: 
				System.out.println("You got the Gun");
				Gun g=new Gun();
				return g;
				default: 
					System.out.println("please select valid option");
					return null;
			}
		}
			else
			{
				System.out.println("You got the Bomb");
				Bomb b=new Bomb();
				return b;
			}
		
	}

}







