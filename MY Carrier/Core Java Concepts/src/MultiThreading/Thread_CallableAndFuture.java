package MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class hello implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		try { Thread.sleep(2000);} catch (Exception e) {}  
		System.out.println(Thread.currentThread().getName());
		return 3;
	}

	
	
}
public class Thread_CallableAndFuture {

	public static void main(String[] args) 
	{
		ExecutorService executor=Executors.newFixedThreadPool(4);
		List<Future<Integer>> all=new ArrayList();
		Callable h=new hello();
		for(int i=0;i<5;i++)
		{
		Future<Integer>future= executor.submit(h);		
		all.add(future);
		}
		System.out.println("I am unrelated operation");
		for(Future<Integer> f: all)
		{
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(f.isDone())
			{
				System.out.println("I am done");
			}
		}
		
	}

}







