import java.io.*;
abstract class Asset
{
	protected String descriptor;
	protected String date;
	protected double currentValue;
	public Asset(String descriptor, String date,double currentValue)
	{
		this.descriptor = descriptor;
		this.date = date;
		this.currentValue = currentValue;
	}
	
	abstract public void displayDetails();
}
class Stock extends Asset
{
	private int num_shares;
	private double share_price;
	private String asset;
	public Stock(String descriptor, String date,double currentValue,int num_shares, double share_price, String asset)
	{
		super(descriptor, date, currentValue);
		this.num_shares = num_shares;
		this.share_price = share_price;
		this.asset = asset;
	}
	public void displayDetails()
	{
		System.out.println("Descriptor :- " + descriptor);
		System.out.println("Date :- " + date);
		System.out.println("Current Value  :- " + currentValue);
		System.out.println("Number of Shares :- " + num_shares);
		System.out.println("Share Price :- " + share_price);
		System.out.println("Asset :- " + asset);
	}
}
class Bond extends Asset
{
	private double interestRate;
	private String asset;
	public Bond(String descriptor, String date,double currentValue,double interestRate, String asset)
	{
		super(descriptor, date, currentValue);
		this.interestRate = interestRate;
		this.asset = asset;
	}
	public void displayDetails()
	{
		System.out.println("Descriptor :- " + descriptor);
		System.out.println("Date :- " + date);
		System.out.println("Current Value  :- " + currentValue);
		System.out.println("Rate of Interest :- " + interestRate);
		System.out.println("Asset :- " + asset);
	}
}
class Savings extends Asset
{
	private double interestRate;
	private String asset;
	public Savings(String descriptor, String date,double currentValue,double interestRate, String asset)
	{
		super(descriptor, date, currentValue);
		this.interestRate = interestRate;
		this.asset = asset;
	}
	public void displayDetails()
	{
		System.out.println("Descriptor :- " + descriptor);
		System.out.println("Date :- " + date);
		System.out.println("Current Value  :- " + currentValue);
		System.out.println("Rate of Interest :- " + interestRate);
		System.out.println("Asset :- " + asset);
	}
}
class TestAsset
{
	public static void main(String[] args)
	{
		Stock st = new Stock("Debjit", "23-8-2019", 56.65, 100, 45.056, "L&T");
		st.displayDetails();
		Bond bn = new Bond("Debjit", "23-8-2019", 56.65,6.75 , "L&T");
		bn.displayDetails();
		Savings sa = new Savings("Debjit", "23-8-2019", 56.65, 6.50, "L&T");
		sa.displayDetails();
	}
}