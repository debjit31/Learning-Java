abstract class VehicleClass
{
	protected int ID;
	protected String name;
	protected String LicenseNumber;
	public VehicleClass(int ID, String name, String LicenseNumber)
	{
		this.ID = ID;
		this.name = name;
		this.LicenseNumber = LicenseNumber;
	}
	abstract public void display();
}
class TwoWheelerClass extends VehicleClass
{
	private String steeringHandle;
	public TwoWheelerClass(int ID, String name, String LicenseNumber,String steeringHandle)
	{
		super(ID,name,LicenseNumber);
		this.steeringHandle = steeringHandle;
	}
	public void display()
	{
		System.out.println("ID :- " + ID);
		System.out.println("Name :- " + name);
		System.out.println("License Number :- " + LicenseNumber);
		System.out.println("Steering Handle :- " + steeringHandle);
	}
}
class FourWheelerClass extends VehicleClass
{
	private String steeringWheel;
	public FourWheelerClass(int ID, String name, String LicenseNumber,String steeringWheel)
	{
		super(ID,name,LicenseNumber);
		this.steeringWheel = steeringWheel;
	}
	public void display()
	{
		System.out.println("ID :- " + ID);
		System.out.println("Name :- " + name);
		System.out.println("License Number :- " + LicenseNumber);
		System.out.println("Steering Wheel :- " + steeringWheel);
	}
}
class TestVehicleClass
{
	public static void main(String[] args)
	{
		TwoWheelerClass two = new TwoWheelerClass(1234,"Debjit", "ieruhui756", "Yes");
		two.display();
		FourWheelerClass four = new FourWheelerClass(2345,"Debjit", "jfhruit757983", "Yes");
		four.display();
	}
}