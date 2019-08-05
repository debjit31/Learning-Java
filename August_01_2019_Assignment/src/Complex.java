import java.util.Scanner;
class Complex {
	int r1,r2,c1,c2;
	// initialising with a parameterized constructor
	Complex(int r1,int r2,int c1,int c2)
	{
		this.r1 = r1;
		this.r2 = r2;
		this.c1 = c1;
		this.c2 = c2;
	}
	public String mult()
	{
		int real = ((r1*r2)-(c1*c2)) ;
		int comp = ((r1*c2)+(c1*r2));
		String s = real  + " + " + comp + "i";
		return s;
		
	}
	

}
class ComplexTest
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		Complex  obj = new Complex(r1,r2,c1,c2);
		String res = obj.mult();
		System.out.println(res);

		sc.close();
		
	}
		
	
}
