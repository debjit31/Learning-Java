import java.util.Scanner;
import java.io.*;
class TestException
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String [] country = {"USA", "UK", "India", "Australia", "France", "Germany"};
		String [] capitals = {"Washington DC", "London", "New Delhi","Canberra", "Paris", "Berlin"};
		
		System.out.println("Enter a Country name to Search :-   ");
		String name = sc.next();
		try
		{
			int ch = -1;
			for(int i = 0; i<country.length; i++)
			{
				if(country[i].equals(name))
					ch = i;
			}
			if(ch == -1)
					throw new NoMatch();
			else
				System.out.println("Capital :- " + capitals[ch]);
		}
		catch(NoMatch e)
		{
			System.out.println(e);
		}
	}
}