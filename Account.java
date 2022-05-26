import java.util.Scanner;
class Account
{
	static Scanner sc=new Scanner(System.in);
	int accno;
	String name;
	double balance,amount,gross;
	void input()
	{
		System.out.println("Enter accno, name, balance");
		accno=sc.nextInt();
		name=sc.next();
		sc.nextLine();
		balance=sc.nextDouble();
		gross=balance;
	}
	void credit()
	{
		System.out.println("Enter amount to credit");
		amount=sc.nextDouble();
		gross=balance+amount;
		System.out.println("New Balance is "+gross);
	}
	void debit()
	{
		System.out.println("Enter amount to debit");
		amount=sc.nextInt();
		if(amount<=balance)
		{
			gross=balance-amount;
			System.out.println("New Balance is "+gross);
		}
		else
		{
			System.out.println("Not enough balance");
		}
	}
	void disp()
	{
		System.out.println("Name = "+name+"\nAccount no = "+accno+"\nBalance = "+gross);
	}
	public static void main(String[] args)
	{
		int i,n;
		System.out.println("How many objects to be made?????");
		n=sc.nextInt();
		Account a[]=new Account[n];
		for(i=0;i<n;i++)
		{
			a[i]=new Account();
			a[i].input();
			a[i].disp();
		}
		for(i=0;i<n;i++)
		{
			a[i].credit();
			a[i].debit();
			a[i].disp();
		}
	}
}