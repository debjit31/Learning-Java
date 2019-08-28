abstract class MotorVehicle
{
	protected String modelName;
	protected String modelNumber;
	protected double modelPrice;
	public MotorVehicle(String modelName, String modelNumber, double modelPrice)
	{
		this.modelName = modelName;
		this.modelNumber = modelNumber;
		this.modelPrice = modelPrice;
	}
	abstract public void display();
}
class Car extends MotorVehicle
{
	private double discountRate;
	public Car(String modelName, String modelNumber, double modelPrice, double discountRate)
	{
		super(modelName, modelNumber, modelPrice);
		this.discountRate = discountRate;
	}
	public void display()
	{
		System.out.println("Model Name :- " + modelName);
		System.out.println("Model Number :- " + modelNumber);
		System.out.println("Model Price :- " + modelPrice);
		System.out.println("Discount Rate :- " + discountRate);
	}
	public void discount()
	{
		double finalPrice = modelPrice - (modelPrice * discountRate)/100;
		System.out.println("Discounted Price = " + finalPrice);
	}
}
class TestMotorVehicle
{
	public static void main(String[] argh)
	{
		Car c = new Car("Mercedes Benz", "E200", 1200000.00, 6.5);
		c.display();
		c.discount();
	}
}