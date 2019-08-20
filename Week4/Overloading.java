import java.io.*;
class Overloading
{
    private String name;
    private String section;
    private int roll;
    Overloading()
    {
        this.name = "Debjit";
        this.section = "D";
        this.roll = 4;
    }
    
    public void display()
    {
        System.out.println("Name :- " + this.name);
        System.out.println("Section :- " + this.section);
        System.out.println("Roll :- " + this.roll);
    }
    
    public void display(String name, int roll, String section)
    {
        System.out.println("Name :- " + name);
        System.out.println("Section :- " + section);
        System.out.println("Roll :- " + roll);
    }
}
class Test
{
    public static void main(String[] args)
    {
        Overloading ob = new Overloading();
        ob.display();
        ob.display("Harry", 4,"D");
        ob.display();

    }
}