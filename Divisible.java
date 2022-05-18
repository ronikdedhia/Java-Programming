class DivisibleThreads implements Runnable
{
	String name;
	Thread t;
	int start,end,count=0;
	DivisibleThreads(String threadname, int s, int e)
	{
		name=threadname;
		t=new Thread(this, name);
		System.out.println("Child Thread: "+t);
		start=s;
		end=e;
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=start; i<=end; i++)
			{
				if(i%7==0)
				{
					System.out.println(t.getName()+" -> "+i);
					count++;
				}
				Thread.sleep(50);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println(name+" Interrupted");
	}
	System.out.println("Count = "+count);
	System.out.println(name+" exiting");
}
}
class Divisible
{
	public static void main(String args[])
	{
		DivisibleThreads mth1=new DivisibleThreads("First",1,100);
		DivisibleThreads mth2=new DivisibleThreads("Second",101,200);
		try
		{
			System.out.println("Waiting for threads to finish");
			mth1.t.join();
			mth2.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main thread exiting");
		}
		int fc;
		fc=mth1.count + mth2.count;
		System.out.println("Final count = "+fc);
	}
}