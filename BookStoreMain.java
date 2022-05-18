import java.util.Scanner;
class Book
{
	String title, author, publisher;
	double price;
	double invest;
	int stock;
	void setter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter title, author, publisher, price and stock");
		title=sc.next();
		author=sc.next();
		publisher=sc.next();
		price=sc.nextDouble();
		stock=sc.nextInt();
	}
	double investm()
	{
		invest=price*stock;
		return invest;
	}
	void display()
	{
		System.out.println("Title= "+title+" \nAuthor= "+author+" \nPublisher="+publisher+" \nPrice= "+price+" \nStock= "+stock);
		System.out.println("Investment ="+invest);
	}
}
class BookStoreMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		double sum=0.0;
		System.out.println("Enter size");
		size=sc.nextInt();
		Book b[]=new Book[size];
		for(i=0;i<size;i++)
		{
			b[i]=new Book();
			b[i].setter();
		}
		for(i=0;i<size;i++)
		{
			sum=sum+b[i].investm();
		}
		for(i=0;i<size;i++)
		{
			b[i].investm();
			b[i].display();
		}
		System.out.println("Total Investment is "+sum);
	}
}