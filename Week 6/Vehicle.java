import java.io.*;
import java.util.*;
class Vehicle
{
	protected int regnNumber;
	protected int speed;
	protected String color;
	protected String ownerName;
	public Vehicle(int regnNumber, int speed, String color, String ownerName)
	{
		this.regnNumber = regnNumber;
		this.speed = speed;
		this.color = color;
		this.ownerName = ownerName;
	}
	public void showData()
	{
		System.out.println("This is a vehicle Class");
	}
}
class Car extends Vehicle 
{
	private String manufacturerName;
	public Car(int regnNumber, int speed, String color, String ownerName,String manufacturerName)
	{
		super(regnNumber,speed,color,ownerName);
		this.manufacturerName = manufacturerName;
	}
	public void showData()
	{
		super.showData();
		System.out.println("Registration Number :- " + this.regnNumber);
		System.out.println("Speed:- " + this.speed);
		System.out.println("Color :- " + this.color);
		System.out.println("Owner Name:- " + this.ownerName);
		System.out.println("Manufacturer Name :- " + this.manufacturerName);
	}
}
class Bus extends Vehicle
{
	private int routeNumber;
	public Bus(int regnNumber, int speed, String color, String ownerName,int routeNumber)
	{
		super(regnNumber,speed,color,ownerName);
		this.routeNumber = routeNumber;
	}
	public void showData()
	{
		super.showData();
		System.out.println("Registration Number :- " + this.regnNumber);
		System.out.println("Speed:- " + this.speed);
		System.out.println("Color :- " + this.color);
		System.out.println("Owner Name:- " + this.ownerName);
		System.out.println("Route Number :- " + this.routeNumber);
	}
}
class TestVehicle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car Class details :- ");
		System.out.println("Registration Number :- ");
		int regnN = sc.nextInt();
		System.out.println("Speed :- ");
		int speed = sc.nextInt();
		System.out.println("Color :- ");
		String color = sc.next();
		System.out.println("Owner Name :- ");
		String ownername = sc.next();
		System.out.println("Manufacturer Name :- ");
		String manu = sc.next();
		Car c = new Car(regnN,speed,color,ownername,manu);
		c.showData();
		
		System.out.println("Enter Bus Class Details:-  ");
		System.out.println("Registration Number :- ");
		regnN = sc.nextInt();
		System.out.println("Speed :- ");
		speed = sc.nextInt();
		System.out.println("Color :- ");
		color = sc.next();
		System.out.println("Owner Name :- ");
		ownername = sc.next();
		System.out.println("Route Number :- ");
		int routeNumber = sc.nextInt();
		Bus b = new Bus(regnN, speed, color, ownername, routeNumber);
		b.showData();
		
	}
}