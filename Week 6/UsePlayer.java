interface Player
{
	// abstract method
	void play();
}
class Musician implements Player
{
	public void play()
	{
		System.out.println("A Musician plays an instrument");
	}
}
class Child implements Player
{
	public void play()
	{
		System.out.println("A child plays in the garden");
	}
}
class Actor implements Player
{
	public void play()
	{
		System.out.println("The Actor is performing a play tonight.");
	}
}
class TestPlayer
{
	public static void main(String[] args)
	{
		Musician m = new Musician();
		m.play();
		Child c = new Child();
		c.play();
		Actor a  = new Actor();
		a.play();
	}
}