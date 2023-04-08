package interface_part;

public interface Vehicle {
	int x=12;
	
	public abstract void start();
	
	public abstract void drive();
	
	private static void playMusic()
	{
		System.out.println("Play music in Car");
	}
}
