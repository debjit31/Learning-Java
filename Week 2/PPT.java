import java.io.*;
class PPT
{
	public static void main(String[] args)
	{
		int a = 150;
		String s="";
		for(int i=0; a <= 1050; i++)
		{
			for(int j=0;j<=i;j++)
			{
		
				s = Integer.toString(a);
				if(s.length() == 3)
					s = "00" + s;
				else
					s = "0" + s;
				System.out.print(s+" ");
				a+=5;
				if (a > 1050)
					break;
			}
			System.out.print("\n");
			s="";
			
		}
	}
}