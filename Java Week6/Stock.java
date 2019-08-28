package assetpkg;
public class Stock extends Asset
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
