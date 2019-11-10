class A {
	synchronized void meth1(B b){
			System.out.println("Inside meth1.....");
			try{
				Thread.sleep(1000);
				}
				catch(InterruptedException e){
					System.out.println(e);
				}
			System.out.println("Trying to enter last() of B");
			b.last();
		}
	
	synchronized void last(){
		System.out.println("We are in last of A");
	}
}
class B
 {
	synchronized void meth2(A a){
			System.out.println("Inside meth2.....");
			try{
				Thread.sleep(1000);
				}
				catch(InterruptedException e){
					System.out.println(e);
				}
			System.out.println("Trying to enter last() of A");
			a.last();
		}
	
/*	synchronized*/ void last(){
		System.out.println("We are in last of B");
	}
}

class DeadLockTest extends Thread{
		A a=new A();
		B b=new B();
		DeadLockTest(){
			this.start();
			a.meth1(b);
		}
		public void run(){
			b.meth2(a);
		}
public static void main(String... args){
	
	DeadLockTest d=new DeadLockTest();
	}
}