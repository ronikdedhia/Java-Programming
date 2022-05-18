abstract class MFigure
{
	double dim1,dim2;
	MFigure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class Rectangle extends MFigure
{
	Rectangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside Area of Rectangle");
		return dim1*dim2;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	}
}
class Triangle extends MFigure
{
	Triangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside Area of Triangle");
		return (dim1*dim2)/2;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	}
}
class AbstractAreas
{
	public static void main(String args[]) 
	{
		Rectangle r=new Rectangle(9,5);
		Triangle t=new Triangle(10,8);
		MFigure fi;
		fi=r;
		System.out.println("Area of Rectangle is "+fi.area());
		fi=t;
		System.out.println("Area of Triangle is "+fi.area());
	}
}