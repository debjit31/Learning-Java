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
class TestThreadPriority
{
	public static void main(String[] args)
	{
		A thA = new A();
		B thB = new B();
		C thC = new C();
		
		thC.setPriority(Thread.MAX_PRIORITY);
		thB.setPriority(thA.getPriority() + 2);
		thA.setPriority(Thread.MIN_PRIORITY);
		
		thA.start();
		thB.start();
		thC.start();
		
		
		
	}
}
