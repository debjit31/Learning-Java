import java.util.Scanner;
import java.io.*;
class Circle
{
    // Declaring Encapsulated instance variables 
    private double x, y;
    private double radius;
    // Public methods of a class
    public void getData(double x1, double y1, double r){
        x = x1;
        y = y1;
        radius = r;
}

public double calculateArea(){
    
    return 3.14*radius*radius;
}

public double calculatePerimeter(){
        return 2*3.14*radius;
}

}

class CircleTest
{
    public void main(String[] arhs){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double r = sc.nextDouble();
        Circle circle1 = new Circle();  // initialize a object of class Circle
        circle1.getData(x,y,r); // Initialize instance variables with user input
        double area = circle1.calculateArea();
        double peri = circle1.calculatePerimeter();
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + peri);
    }   
}