import java.util.Scanner;
class Employee
{
	int id;
	String fname, lname;
	double salary,r,annual;
	Employee()
	{
		fname="a";
		lname="z";
		id=1;
	}
	void inpute()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name, last name, id and salary");
		fname=sc.next();
		lname=sc.next();
		id=sc.nextInt();
		salary=sc.nextDouble();
	}
	double sala()
	{
		if(salary<0)
		{
			salary=0;
		}
		return salary;
	}
	void raise()
	{
		annual=salary*12;
		System.out.println("Yearly salary= "+annual);
		r=annual+(annual*0.1);
		System.out.println("Annual salary with raise ="+r);
	}
	void dispe()
	{
		System.out.println("first name= "+fname+"  last name= "+lname+"  id= "+id+"  salary= "+salary);
	}
}
class EmployeeTest
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.inpute();
		e1.sala();
		e1.dispe();
		e1.raise();
		Employee e2=new Employee();
		e2.inpute();
		e2.sala();
		e2.dispe();
		e2.raise();
	}
}