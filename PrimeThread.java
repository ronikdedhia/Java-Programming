class PrimeThreaded implements Runnable
{
	Thread t;
	String name;
	int start,end,i,j,count;
	PrimeThreaded(String n,int s,int e)
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
				for(j=2;j<i;j++)
				{
					if(i%j==0)
						break;
				}
				if(i==j)
				{
					System.out.println(name+" Prime:"+i);
					Thread.sleep(200);
				}
			}
			System.out.println("Final count= "+count);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Thread");
		}
		System.out.println("Exiting "+name);
	}
}
class PrimeThread
{
	public static void main(String[] args)
	{
		PrimeThreaded p1=new PrimeThreaded("First",1,50);
		PrimeThreaded p2=new PrimeThreaded("Second",51,100);
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