package MultiThreading;

class Mahesh extends Thread
{
	Synchronization syn;
	Mahesh(Synchronization syn)
	{
		this.syn=syn;
	}
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			syn.increment();
		}
		
	}
}

class Yogesh extends Thread
{
	Synchronization syn;
	Yogesh(Synchronization syn)
	{
		this.syn=syn;		
	}
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			syn.increment();
		}
		
	}
}
public class Synchronization {

	int count;
	public synchronized void increment()
	{
		synchronized(this)
		{
		count++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Synchronization sync=new Synchronization();
		Mahesh obj1=new Mahesh(sync);
		Yogesh obj2=new Yogesh(sync);
		obj1.start();
		obj2.start();
		
		try {
			obj1.join();
			obj2.join();
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		System.out.println("Count "+ sync.count);
					
	}

}
