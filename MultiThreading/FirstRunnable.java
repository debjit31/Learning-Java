class ThreadA implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Value of i in ThradA is="+i);
			System.out.println("Exiting from ThreadA.....");
		}
	}
}
class ThreadB implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Value of i in ThradB is="+i);
			System.out.println("Exiting from ThreadB.....");
		}
	}
}

class FirstRunnable{
	public static void main(String... args){
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.start();
		t2.start();
		System.out.println("Exiting from Main....");
		
	}
}