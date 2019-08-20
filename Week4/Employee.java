import java.io.*;
class Employee
{
    private int eid;
    private String name;
    private double sal;
    public Employee()
    {
        this.eid = 1;
        this.name = "James Hopkins";
        this.sal = 55000.000;
    }
    public void display(String val)
    {
        System.out.println("We are in Base class method :- "+val);
    }
}
class developer extends Employee
{
    private String Domain;
    developer()
    {
        this.Domain = "Data Scientist";
    }
    public void display(String val)
    {
        System.out.println("We are in Sub class method :- "+val);
    }
}

class Test
{
    public static void main(String[] args)
    {
        developer ob = new developer();
        ob.display("Python");
    }
}