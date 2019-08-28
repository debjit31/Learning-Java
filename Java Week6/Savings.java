package assetpkg;
public class Savings extends Asset
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
