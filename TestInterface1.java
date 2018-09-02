interface Shape
{
	final int a=5;
	final int length=6,breadth=5;
	void area();
}
class Square implements Shape
{
	public void area()
	{
		System.out.println("Area of a square is  : "+(a*a));
	}
}
class Rectangle implements Shape
{
	public void area()
	{
		System.out.println("Area of a rectangle is: "+(length*breadth));
	}
}
public class TestInterface1
{
	public static void main(String[] args)
	{
		Shape s1=new Square();
		s1.area();
		Shape s2=new Rectangle();
		s2.area();
	}
}
