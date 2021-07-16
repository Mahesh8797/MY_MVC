package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Work implements Runnable
{
	int i;
	Work(int i)
	{
		this.i=i;
	}
	public void run()
	{	
			System.out.println(Thread.currentThread().getName()+ " "+i);
	}
}
public class ThreadT_DifferentExecutors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.FixedThreadPool
		Runtime r=Runtime.getRuntime();
		ExecutorService executor1=Executors.newFixedThreadPool(r.availableProcessors());
		for(int i=0;i<5;i++)
		{
		Runnable run=new Work(i);
		//executor1.execute(run);
		}
		//2.CachedThreadPool
		ExecutorService executor2=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
		{
		Runnable run=new Work(i);
		executor1.execute(run);
		}
		//3.ScheduledThreadPool
		ScheduledExecutorService executor3=Executors.newScheduledThreadPool(r.availableProcessors());
		for(int i=0;i<5;i++)
		{
			Runnable run=new Work(i);
			executor3.schedule(run, 30, TimeUnit.SECONDS);
			executor3.scheduleWithFixedDelay(run, 15, 10, TimeUnit.SECONDS);
		}
		//4.SingleThreadedPool
		ExecutorService executor4=Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++)
	    {
		Runnable run=new Work(i);
		executor1.execute(run);
		}
		
	}

}
