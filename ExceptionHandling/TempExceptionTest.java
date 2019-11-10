import java.io.*;
import java.util.*;
import excep.TooHot;
import excep.TooCold;
class TempExceptionTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		try
		{
			if(temp > 35)
				throw new TooHot();
			else if (temp < 5)
				throw new TooCold();
			else
			{
				System.out.println(temp);
				System.out.println(temp*(9/5)+32);
			}
		}
		catch(TooHot e)
		{
			System.out.println(e);
		}
		catch(TooCold e)
		{
			System.out.println(e.toString());
		}
	}
}