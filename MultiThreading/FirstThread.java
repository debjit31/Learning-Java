// MultiThreading by extending Thread Class
class ThreadA extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("Value of i in ThradA is="+i);
			
		}
		System.out.println("Exiting from ThreadA.....");
	}
}
class ThreadB extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("Value of i in ThradB is="+i);
		
		}
		System.out.println("Exiting from ThreadB.....");
	}
}

class FirstThread
{
	public static void main(String... args){
		System.out.println(" from Main....");
		ThreadA a=new ThreadA();
		a.start();
		ThreadB b=new ThreadB();
		b.start();
		System.out.println("Exiting from Main....");
		
	}
}
