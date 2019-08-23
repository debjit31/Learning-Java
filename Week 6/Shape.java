import java.io.*;
import java.util.*;
abstract class Shape
{
	protected int dim1;
	protected int dim2;
	public Shape(int dim1, int dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	abstract public void printArea();
	abstract public void printPeri();
}
class Rectangle extends Shape
{
	public Rectangle(int dim1, int dim2)
	{
		super(dim1, dim2);
	}
	public void printArea()
	{
		System.out.println("Area of the Rectange is = " + (dim1*dim2));
	}
	public void printPeri()
	{
		System.out.println("Perimeter of rectangle :- " + (2*(dim1+dim2)));
	}
}
class Triangle extends Shape
{
	private int dim3;
	private int height;
	public Triangle(int dim1, int dim2, int dim3, int height)
	{
		super(dim1,dim2);
		this.dim3 = dim3;
		this.height = height;
	}
	public void printArea()
	{
		System.out.println("Area of the triangle is = " + (dim1*height)/2);
	}
	public void printPeri()
	{
		System.out.println("Perimeter of triangle :- " + (dim1+dim2+dim3));
	}
	
}
class TestShape
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of the Rectange :- ");
		System.out.println("Enter the length :- ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth :- ");
		int breadth = sc.nextInt();
		Rectangle rec = new Rectangle(length, breadth);
		rec.printArea();
		rec.printPeri();
		
		System.out.println("Enter the dimensions of the Triangle :- ");
		System.out.println("Enter the length of the base :- ");
		int base = sc.nextInt();
		System.out.println("Enter the length of the 2 sides :- ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		System.out.println("Enter the height  :- ");
		int height = sc.nextInt();
		Triangle tri = new Triangle(base, s1, s2, height);
		tri.printArea();
		tri.printPeri();
	}
}





