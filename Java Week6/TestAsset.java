import assetpkg.Asset;
import assetpkg.Bond;
import assetpkg.Savings;
import assetpkg.Stock;
public class TestAsset
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