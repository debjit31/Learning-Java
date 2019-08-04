import java.util.Scanner;
import java.io.*;
class Rectangle
{
    // Declaring Encapsulated instance variables 
    private double l, b;
   // Public methods of a class
    public void getData(double l1, double b1){
        l = l1;
        b = b1;
}

public double calculateArea(){
    
    return l*b ; 
}

public double calculatePerimeter(){
        return 2*(l+b);
}

}

class RectTest
{
    public void main(String[] arhs){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rect1 = new Rectangle();  // initialize a object of class Circle
        rect1.getData(l,b); // Initialize instance variables with user input
        double area = rect1.calculateArea();
        double peri = rect1.calculatePerimeter();
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + peri);
    }   
}