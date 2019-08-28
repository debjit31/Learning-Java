import java.io.*;
import java.util.Scanner;
abstract class AbstractProduct
{
	protected String productID;
	protected String productName;
	protected String productDescription;
	public AbstractProduct(String productID, String productName, String productDescription)
	{
		this.productID = productID ;
		this.productName = productName;
		this.productDescription = productDescription;
	}
	abstract void display();
}
class Product extends AbstractProduct
{
	//private int productID;
	private int price;
	public Product(String productID, String productName, String productDescription, int price)
	{
		super(productID,productName,productDescription);
		//this.productID = productID;
		this.price = price;
	}
	public void display()
	{
		//System.out.println("ProductID :- " + this.productID);
		System.out.println("Product Name :- " + this.productName);
		System.out.println("Product Description :- " + this.productDescription);
		System.out.println("ProductID :- " + this.productID);
		System.out.println("Product Price :- " + this.price);
	}
}
class Book extends Product
{
	private String author;
	private String isbn;
	private String title;
	public Book(String productID, String productName, String productDescription,int productID, int price,String author, String ISBN, String title)
	{
		super(productID,productName,productDescription, productID, price);
		this.author = author;
		this.ISBN = ISBN;
		this.title = title;
	}
	public void display()
	{
		super.display();
		System.out.println("Author :- "+author);
		System.out.println("ISBN :- "+ISBN);
		System.out.println("Title :- "+ title);
	}
}
class CompactDisc extends Product
{
	private String artist;
	private String title;
	public CompactDisc(String productID, String productName, String productDescription,int productID, int price, String artist,String title)
	{
		super(productID,productName,productDescription, productID, price);
		this.artist = artist;
		this.title = title;
	}
	public void display()
	{
		super.display();
		System.out.println("Artist :- " + artist);
		System.out.println("Title :- " + title);
	}
}
class TravelGuide extends Book
{
	private String country;
	public TravelGuide(String productID, String productName, String productDescription,int productID, int price,String author, String isbn, String title,String country)
	{
		super(productID,productName,productDescription, productID, price,author,isbn, title);
		this.country = country;
	}
	public void display()
	{
		super.display();
		System.out.println("Country :- " + country);
	}
}
class TestAbstractProduct
{
	public static void main(String[] args)
	{
		Product p = new Product(123,"MiA3", "Mobile Phones", 25000);
		p.display();
		p = new Book(123,"MiA3", "Mobile Phones", 25000,"JK Rowling", "454676456", "Harry Potter and the Goblet of Fire");
		p.display();
		p = new CompactDisc(123,"MiA3", "Mobile Phones", 25000,"JK Rowling", "737538657365378", "Harry Potter and the Goblet of Fire","Charlie Puth", "Attention");
		p.display();
		TravelGuide tr = new TravelGuide(123,"MiA3", "Mobile Phones", 25000,"JK Rowling", "8765734637", "Harry Potter and the Goblet of Fire","USA");
		tr.display();
	}
}