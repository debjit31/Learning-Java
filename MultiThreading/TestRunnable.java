class ThreadA implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Value of i in ThreadA is="+i);
			
		}
		System.out.println("Exiting from ThreadA.....");
	}
}
class ThreadB implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Value of i in ThradB is="+i);
			
		}
		System.out.println("Exiting from ThreadB.....");
	}
}

class TestRunnable
{
	public static void main(String[] args)
	{
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		Thread r1 = new Thread(a);
		Thread r2 = new Thread(b);
		
		r1.start();
		r2.start();
	}
}