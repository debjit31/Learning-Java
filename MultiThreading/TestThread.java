class A extends Thread
{
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			System.out.println("\t From Thread A :- " + " i :- " + i);
		}
		System.out.println("Thread A completed!!!");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			System.out.println("\t From Thread B :- " + " i :- " + i);
		}
		System.out.println("Thread B completed!!!");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			System.out.println("\t From Thread C :- " + " i :- " + i);
		}
		System.out.println("Thread C completed!!!");
	}
}
class TestThread
{
	public static void main(String[] args)
	{
		new A().start();
		new B().start();
		new C().start();
	}
}
