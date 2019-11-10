import java.io.*;
class TestThread{
public static Object r1=new Object();
public  static Object r2=new Object();
public static void main (String s[])
{
ThreadDemo1  T1=new ThreadDemo1();
ThreadDemo2  T2=new ThreadDemo2();
T1.start();
T2.start();

}
}
class ThreadDemo1 extends Thread{
public void run(){
	synchronized(TestThread.r1){
		System.out.println("Thread1: Holding r1.......");
	try{
		Thread.sleep(1000);
	}catch(Exception e){}
	System.out.println("Thread1: Waiting for r2.......");
	synchronized(TestThread.r2){
		System.out.println("Thread2: Holding r2.......");
	}
	}
}}
class ThreadDemo2 extends Thread{
public void run(){
	synchronized(TestThread.r2){
		System.out.println("Thread2: Holding r2.......");
	try{
		Thread.sleep(1000);
	}catch(Exception e){}
	System.out.println("Thread2: Waiting for r1.......");
	synchronized(TestThread.r1){
		System.out.println("Thread1: Holding r1.......");
	}
	}
}}
