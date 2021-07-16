package MultiThreading;

public class X_OtherTopics extends Thread {
	
	public  void run()
	{
		System.out.println("hi");
	}
	public void finalize()
	{
		System.out.println("garbage colected");
	}
	public static void main(String[] args) {
		
		//1. Start the thread twice
		X_OtherTopics t1=new X_OtherTopics();
		X_OtherTopics t2=new X_OtherTopics();
		t1.start();
		//t1.start();
		
		//2.calling run without start
		t1.run();
		
		//3.priority of thread
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		System.out.println("Priority of max thread : "+t1.getPriority());
		System.out.println("Priority of normal thread : "+t2.getPriority());
		
		//4. Daemon thread
		t2.setDaemon(true);
		System.out.println("Setting daemon thread");		
		t2.start();
		
		//5.Creating threadGroups
		
		ThreadGroup tg=new ThreadGroup("First Group");
		Thread t3=new Thread(tg,"one");
		Thread t4=new Thread(tg,"two");
		Thread t5=new Thread(tg,"three");
		System.out.println(t3.getName()+" "+t4.getName()+ " "+t5.getName());
		System.out.println(tg.getName());
		
		//6.shutdown hook
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(t3);
			
		//7.garbage collection and finalize method
		t1=null;
		t2=null;
		System.gc();
		
		//8. Memory available and processors of Runtime
		System.out.println("Number of processors : "+r.availableProcessors());
		System.out.println("Total memory : "+r.totalMemory());
		System.out.println("free memory :"+r.freeMemory());
		System.gc();
		System.out.println("After gc(), free memory :"+r.freeMemory());
				
	}

}
