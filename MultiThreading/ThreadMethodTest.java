class NewThread implements Runnable
{
String name;
Thread t;
NewThread(String tname)
{
	name=tname;
        //t=new Thread(this, tname);
        //System.out.println("New Thread"+t);
        //t.start();
}

public void run()
{
	try{
		for(int i=5;i>0;i--)
                {
		  System.out.println(name+":"+i);
		  Thread.sleep(1000);
                 } 
	}
          catch(InterruptedException e)
          {
 		System.out.println(name+"interrupted");
           }
          
         System.out.println(name+"exiting");

}
}


class ThreadMethodTest{

public static void main(String s[])
{

	NewThread ob1=new NewThread("One");
	NewThread ob2=new NewThread("two");
	NewThread ob3=new NewThread("Three");
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        Thread t3=new Thread(ob3);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread one is alive"+t1.isAlive());
        System.out.println("Thread one is alive"+t2.isAlive());
        System.out.println("Thread one is alive"+t3.isAlive());
        System.out.println("Waiting for thread to finish");
        try{
        t1.join();
        t2.join();
        t3.join();
	}
	catch(InterruptedException e)
          {
 		System.out.println("Main Thread is interrupted");
           }
	System.out.println("Thread one is alive"+t1.isAlive());
        System.out.println("Thread one is alive"+t2.isAlive());
        System.out.println("Thread one is alive"+t3.isAlive());
        System.out.println("Main Thread Exiting");
}
}

