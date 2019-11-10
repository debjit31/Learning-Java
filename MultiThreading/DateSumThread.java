import java.util.*;
class Time extends Thread{

	public void run(){
           while(true)
           {
                 System.out.println(new Date());
                 try{
                    sleep(1000);
                 }
                 catch(InterruptedException e)
                 {
                  }

	  }
       }
}


class Sum extends Thread{

	public void run(){
           while(true)
           {
                 Random r =new Random();  
                 int sum=0;
                 sum=sum+r.nextInt(200); 
                 System.out.println("Cumulative sum is"+sum);              
                 try{
                    sleep(1000);
                 }
                 catch(InterruptedException e)
                 {
                  }

	  }
       }
}
class DateSumThread{

	public static void main(String args[])
        {
          Time t=new Time();
          Sum s= new Sum();
          t.start();
          s.start();
        }
}
