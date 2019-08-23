import java.io.*;
import java.util.Scanner;
abstract class Accounts
{
	protected double balance;
	protected int acccountNumber;
	protected String accountHoldersName;
	protected String address;
	public Accounts(double balance, int acccountNumber, String accountHoldersName, String address)
	{
		this.balance = balance;
		this.acccountNumber = acccountNumber;
		this.accountHoldersName = accountHoldersName;
		this.address = address;
	}
	abstract public void withdrawal();
	abstract public void deposit();
	public void display()
	{
		System.out.println("Your Balance is :- " + this.balance);
	}
}
class SavingsAccount extends Accounts
{
	Scanner sc = new Scanner(System.in);
	private double rateofInterest;
	public SavingsAccount(double balance, int acccountNumber, String accountHoldersName, String  address,double rateofInterest)
	{
		super(balance, acccountNumber,accountHoldersName,address);
		this.rateofInterest = rateofInterest;
	}
	public void withdrawal()
	{
		System.out.println("\nEnter Withdraw Amount:- ");
		double withdr = sc.nextDouble();
		balance = balance - withdr;
		if (balance < 2000)
		{
			balance = balance + withdr;
			System.out.println("Insufficient Funds!!!!!!");
			System.out.println("Penalty levied due to low balance.");
			double newWithd = balance - 2000;
			balance = 2000;
			System.out.println("Restricted withdrawal:- " + newWithd);
			System.out.println("Your balance is :-  "+ balance);
		}
		else
			System.out.println("Balance after withdrawal:- " + balance);
	}
	public void deposit()
	{
		System.out.println("\nEnter Deposit Amount:- ");
		double depo = sc.nextDouble();
		balance+=depo;
		System.out.println("Balance after deposit :-" + (balance));
	}
	public void calcAmount()
	{
		double amount = balance + (balance * rateofInterest*1)/100;
		System.out.println("Your balance after 1 year of interest is :- "  + amount);
	}
}
class TestAccounts
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SavingsAccount sa = new SavingsAccount(5000.00, 123456, "Debjit Chattopadhyay", "Howrah", 6.50);
		while(true)
		{
		System.out.println("\n1.Deposit\n2.Withdrawal\n3.Display Balance\n4.Display Amount\n5.Exit");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				sa.deposit();
			break;
			case 2:
				sa.withdrawal();
			break;
			case 3:
				sa.display();
			break;
			case 4:
				sa.calcAmount();
			break;
			case 5:
				System.exit(0);
			break;
			default:
				System.out.println("\nWrong Choice!!!!");
		}
		}
	}
}