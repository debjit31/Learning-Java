package assetpkg;
import java.io.*;
abstract public class Asset
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
