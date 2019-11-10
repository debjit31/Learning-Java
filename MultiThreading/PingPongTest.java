import java.util.*;

class PingPong extends Thread{
        String msg;
        Random r=new Random();
        PingPong(String msg){
                this.msg=msg;
        }
        public void run(){
                try{
                        while(true){
                                
                                for(int i=1;i<=r.nextInt(100);i++)
                                        System.out.print(" ");
                                sleep(5000);
                                System.out.print(msg);
                        }
                }
                catch(InterruptedException ie){
                        ie.printStackTrace();
                }
        }
}
class PingPongTest{
        public static void main(String k[]){
                PingPong pi=new PingPong("PING");
                PingPong po=new PingPong("pong");
                pi.start();
                po.start();
        }
}
