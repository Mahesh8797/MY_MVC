package MultiThreading;

public class JoinMethod extends Thread{

	public void run()
	{
		char arr[]={'a','e','i','o','u'};
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}

	public static void main(String[] args) {
			
		JoinMethod t1=new JoinMethod();
		JoinMethod t2=new JoinMethod();
		JoinMethod t3=new JoinMethod();
		t1.start();	
		
		try
		{	
			t1.join(); //t2 waits until t1 gets executed
		}catch(Exception e){	System.out.println(e);}
		
		t2.start();
		try
		{	
			t2.join(3000); //t3 waits until the time is over, if the time ends then t3 starts its execution
			}catch(Exception e){	System.out.println(e);}
		
		t3.start();
		try
		{	
			t3.join(); //Rest of the execution waits until t3 is executed
			}catch(Exception e){	System.out.println(e);}
		
		//Getting the thread names
		t1.setName("mahe");
		t2.setName("yoge");
		System.out.println("Name of first thread : "+t1.getName());
		System.out.println("Name of second thread : "+t2.getName());
		System.out.println("Name of third thread : "+currentThread().getName());			
	}
}
