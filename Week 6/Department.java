import java.io.*;
import java.util.*;
interface Department
{
	String deptName = "CSE";
	String deptHead = "SKG";
	//abstract method
	void showData();
}
class Hostel 
{
	protected String hostelName;
	protected String hostelLocation;
	protected int numberofRooms;
	public Hostel(String hostelName,String hostelLocation, int numberofRooms)
	{
		this.hostelName = hostelName;
		this.hostelLocation = hostelLocation;
		this.numberofRooms = numberofRooms;
	}
	public void print()
	{
		System.out.println("Hostel Name :- " + this.hostelName);
		System.out.println("Hostel Location :- " + this.hostelLocation);
		System.out.println("Number of Rooms :- " + this.numberofRooms);
	}
}
class Student extends Hostel implements Department
{
	private String studentName;
	private int regdNo;
	private String electiveSubject;
	private int avgMarks;
	public Student(String hostelName,String hostelLocation, int numberofRooms,String studentName, int regdNo, String electiveSubject, int avgMarks)
	{
			super(hostelName,hostelLocation,numberofRooms);
			this.studentName = studentName;
			this.regdNo = regdNo;
			this.electiveSubject = electiveSubject;
			this.avgMarks = avgMarks;
	}
	public void showData()
	{
		super.print();
		System.out.println("Department name :- " + deptName);
		System.out.println("Department Head :- " + deptHead);
		System.out.println("Student Name :- " + this.studentName);
		System.out.println("Registration Number :- " + this.regdNo);
		System.out.println("Subject :- " + this.electiveSubject);
		System.out.println("Average Marks :- " + this.avgMarks);
	}
}
class TestDepartment
{
	public static void main(String[] args)
	{
		Student s = new Student("ABC", "Kolkata", 10, "Debjit Chattopadhyay", 12345, "CSE", 80);
		s.showData();
	}
	
}


















