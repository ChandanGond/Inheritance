//Question: Write a Java program to create a class called Shape with a method called 
//getArea(). Create a subclass called Rectangle that overrides the getArea() 
//method to calculate the area of a rectangle.


class Shape
{
	public double getArea()
	{
		return 0.0;
	}
}
class Rectangle  extends Shape
{
	private int length; private int width;
	
	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	public double getArea()
	{
		return length*width;
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle(12,12);
		double area = rectangle.getArea();
	    System.out.println("The area of the rectangle is: " + area);	}
}