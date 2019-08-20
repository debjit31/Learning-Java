import java.util.Scanner;
import java.io.*;
class Vehicle
{
    protected int regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    Vehicle(int regnNumber, int speed, String color, String ownerName)
    {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    
    public void showData()
    {
        System.out.println("This is a Vehicle Class");
        System.out.println("Registration Number :- " + this.regnNumber);
        System.out.println("Speed :- " + this.speed);
        System.out.println("Color :- " + this.color);
        System.out.println("Owner Name :- " + this.ownerName);
    }
}

class Bus extends Vehicle
{
    private int routeNumber;
    public Bus(int regnNumber, int speed, String color, String ownerName, int route)
    {
        super(regnNumber,speed,color,ownerName);
        this.routeNumber = route;
    }
    
    public void showData()
    {
        super.showData();
        System.out.println("Route Number = " + this.routeNumber);
    }
}

class Car extends Vehicle
{
    private String manufacturerName;
    public Car(int regnNumber, int speed, String color, String ownerName, String manufacturerName)
    {
        super(regnNumber,speed,color,ownerName);
        this.manufacturerName = manufacturerName;
    }
    public void showData2()
    {
        super.showData();
        System.out.println("Manufacturer Name :- "+ this.manufacturerName);
    }
}

class Test
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter route Number :- ");
        int route = sc.nextInt();
        System.out.println("Enter registration number :- ");
        int reg = sc.nextInt();
        System.out.println("Enter speed of the car :- ");
        int speed = sc.nextInt();
        System.out.println("Enter color = ");
        String color = sc.next();
        System.out.println("Enter owner name :- ");
        String owner = sc.next();
        System.out.println("Enter manufacturer name :- ");
        String manu = sc.next();
        
        System.out.println("Enter the details about your Bus :- ");
        Bus b = new Bus(reg, speed, color, owner, route);
        b.showData();
        System.out.println("Enter the details about your Car :- ");
        Car c = new Car(reg, speed, color, owner, manu);
        c.showData();
    }
}