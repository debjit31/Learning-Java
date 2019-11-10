class P extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("Value of i in P is="+i);
			
		}
	System.out.println("Exiting from P.....");
	}
		
}
class Q extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("Value of i in Q is="+i);
		
		}
		System.out.println("Exiting from Q.....");	
	}
		
}

class PriorityThread{
	public static void main(String... args){
		P a=new P();
		Q b=new Q();
		//a.setPriority(b.getPriority()+2);
		b.setPriority(a.getPriority()+2);
		a.start();
		b.start();
		System.out.println("Exiting from Main....");
		
	}
}
