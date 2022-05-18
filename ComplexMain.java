import java.util.Scanner;
class Complex
{
	int i,j;
	Complex()
	{

	}
	void Setter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real and img");
		i=sc.nextInt();
		j=sc.nextInt();		
	}
	void Getter()
	{
		System.out.println("real and img are  "+i+"  "+j);
	}
	Complex addComp(Complex ob)
	{
		Complex t=new Complex();
		t.i=i+ob.i;
		t.j=j+ob.j;
		System.out.println("t"+t);
		return t;
	}
}
class ComplexMain
{
	public static void main(String[] args) 
	{
		Complex c1=new Complex();
		c1.Setter();
		System.out.println("c1"+c1);
		Complex c2=new Complex();
		c2.Setter();
		Complex c3=c1.addComp(c2);
		c1.Getter();
		c2.Getter(); 
		c3.Getter();
		System.out.println("c2"+c2);
		System.out.println("c3"+c3);
	}
}  