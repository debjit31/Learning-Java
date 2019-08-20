import java.io.*;
class Staff
{
	private int code;
	private String Name;
	public Staff(int code, String name)
	{
		this.code = code;
		this.name = name;
	}
	public void print()
	{
		System.out.println(code+name);
	}
}
class Teacher extends Staff
{
	private String subject;
	private String publications;
	public Teacher(int code, String name, String subject, String Publication)
	{
		super(code, name);
		this.subject = subject;
		this.publications = Publication;
	}
	public void print1()
	{
		print();
		System.out.println(subject+publications);
	}
}
class Officer extends Staff
{
	private int grade;
	public Officer(int code, String name, int grade)
	{
		super(code, name);
		this.grade = grade;
	}
	public void print2()
	{
		print();
		System.out.println(grade);
	}
}

class Typist extends Staff
{
	private int speed;
	public Typist(int code, String name, int speed)
	{
		super(code, name);
		this.speed = speed;
	}
	public void print3()
	{
		print();
		System.out.println(speed);
	}
}
class Regular extends Typist
{
	private int salary;
	public Regular(int code , String name, int speed,int salary)
	{
		super(code, name, speed);
		this.salary = salary;
	}
	public void print4()
	{
		print();
		System.out.println(salary);
	}
}
class Casual extends Typist
{
	private int daily_wages;
	public Regular(int code , String name, int speed,int daily_wages)
	{
		super(code, name, speed);
		this.daily_wages = daily_wages
	}
	public void print5()
	{
		print();
		System.out.println(daily_wages);
	}
}
class Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Teacher t = new Teacher();
		t.print1();
		Officer o = new Officer();
		o.print2();
	}
}































































