class LeapThreaded implements Runnable
{
	Thread t;
	String name;
	int start,end,i,j;
	LeapThreaded(String n,int s,int e)
	{
		name=n;
		t=new Thread(this, name);
		System.out.println("Entering Thread "+n);
		start=s;
		end=e;
		t.start();
	}
	public void run()
	{
		try
		{
			for(i=start;i<=end;i++)
			{
				if(i%4==0)
					System.out.println(name+"Leap Year "+i);
				Thread.sleep(300);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Thread");
		}
		System.out.println("Exiting "+name);
	}
}
class LeapThread
{
	public static void main(String[] args)
	{
		LeapThreaded p1=new LeapThreaded("First",2001,2050);
		LeapThreaded p2=new LeapThreaded("Second",2051,2100);
		try
		{
			p1.t.join();
			p2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
	}
}