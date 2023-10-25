import java.util.Scanner;

class Circle {
    double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double calculateArea() 
    {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class FindCirArea {
    public static void main(String[] args) 
    {
        Scanner done = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        double radius = done.nextDouble();
        Circle myCircle = new Circle(radius);
        double area = myCircle.calculateArea();
        System.out.println("Area of circle is : " + area);
    }
}