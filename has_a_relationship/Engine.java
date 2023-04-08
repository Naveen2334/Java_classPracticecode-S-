package has_a_relationship;
public class Engine {
	int hp;
	int strokes;
	String type;
	Engine()
	{
		
	}
	Engine(int hp, int strokes, String type)
	{
		this.hp=hp;
		this.strokes=strokes;
		this.type=type;
	}
	public void displayEngine()
	{
		System.err.println("Engine hp is: "+hp);
		System.out.println("Engine strokes is: "+strokes);
		System.out.println("Engine type is: "+type);
	}

	

}
