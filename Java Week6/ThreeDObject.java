import java.io.*;
import java.util.*;
abstract class ThreeDObject
{
	protected int dim1;
	protected int dim2;
	protected int dim3;
	public ThreeDObject(int dim1,int dim2, int dim3)
	{
		this.dim1=dim1;
		this.dim2=dim2;
		this.dim3=dim3;
	}
	abstract public void wholeSurfaceArea();
	abstract public void volume();
}
class Box extends ThreeDObject
{
	public Box(int dim1, int dim2, int dim3)
	{
		super(dim1,dim2,dim3);
	}
	public void wholeSurfaceArea()
	{
		System.out.println("Surface Area of box :- " + (dim1*dim2+dim2*dim3 + dim1*dim3));
	}
	public void volume()
	{
		System.out.println("Volume of Box = " + (dim1*dim2*dim3));
	}
}
class Cube extends ThreeDObject
{
	public Cube(int dim1)
	{
		super(dim1,dim1,dim1);
	}
	public void wholeSurfaceArea()
	{
		System.out.println("Surface Area of Cube :- " + (6*dim1*dim1));
	}
	public void volume()
	{
		System.out.println("Volume of Box = " + (dim1*dim1*dim1));
	}
}
class Cylinder extends ThreeDObject
{
	Cylinder(int dim1, int dim2, int dim3)
	{
		super(dim1,dim2,0);
	}
	public void wholeSurfaceArea()
	{
		System.out.println("Surface Area of Cube :- " + (float)(2*dim1*dim2*3.14+2*3.14*dim1*dim1));
	}
	public void volume()
	{
		System.out.println("Volume of Box = " + (float)(3.14 * dim1 * dim1 * dim2));
	}
}
class TestThreeDObject
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of Box :- ");
		int s1 = sc.nextInt();
		int  s2 = sc.nextInt();
		int s3 = sc.nextInt();
		Box b = new Box(s1,s2,s3);
		b.wholeSurfaceArea();
		b.volume();
		
		System.out.println("Enter the dimensions of Cube :- ");
		int side = sc.nextInt();
		Cube c = new Cube(side);
		c.wholeSurfaceArea();
		c.volume();
	}
}