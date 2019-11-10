import java.util.*;
class Rand
{
	String r;
	Random r=new Random();
	int blank=r.nextInt(10);
	Rand(String p)
	{
		r=p;
	}
	void show()
	{
		System.out.println("r");
	}
}
class Ping extends Rand implements Runnable
{
	Ping()
	{
                super("PING");
                k = new Thread(this);
                k.start(); 
	}
	public void run()
	{
		for(int i=1;i<=blank;i++)
		{
			System.out.print(" ");
		}
		show();

	}
	
}
	
class MyThread
{
	public static void main(String jo[])
	{
		Ping pi=new Ping();
		pi.start();
	{
}
