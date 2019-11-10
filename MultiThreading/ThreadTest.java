import java.util.*;
class ThreadT extends Thread
{
    String s;
    ThreadT(String s)
    {
        this.s=s;
    }
    public void run()
    {
        while(true)
        {
           System.out.print(s);
           Random r1=new Random();
           int f=r1.nextInt(100);
           for(int i=0;i<=f;i++)
               System.out.print("  ");

           try
            {
                 sleep(500);
            }
            catch(InterruptedException ie)
            {}

        }
    }        
}
class ThreadTest
{
    public static void main(String k[])
    {
        ThreadT ta=new ThreadT("ping");
        ThreadT tb=new ThreadT("PONG");
        ta.start();
        tb.start();
     }
}
