package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
	int i;
	WorkerThread(int i)
	{
		this.i=i;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " start : "+i);
		 try { Thread.sleep(5000);} catch (Exception e) {}
		 System.out.println(Thread.currentThread().getName()+ " end : "+i);
		
	}
	
}
public class Thread_ThreadPoolExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++)
		{
			Runnable worker=new WorkerThread(i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		while (!executor.isTerminated()) {
        }
		System.out.println("finished all threads");
	}

}
