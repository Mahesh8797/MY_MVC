package MultiThreading;
public class InterThreadCommunication {
	 static int num;
	 boolean value=false;
	public synchronized void put(int num)
	{
		this.num=num;	
		while(value)
		{
			try{wait();}catch(Exception e)	{	System.out.println(e);}
		}
		System.out.println("PUT : "+num++);
		value=true;
		notify();	
	}	
	public synchronized void get()
	{
		while(!value)
		{
			try{wait();}catch(Exception e)	{System.out.println(e);}		
		}
		System.out.println("GET : "+num);
		value=false;
		notify();        //notifies put method		
	}
	public static void main(String[] args)
	{
		InterThreadCommunication it=new InterThreadCommunication();
		new M(it);
		new Y(it);
	}
}
class M implements Runnable
{
	InterThreadCommunication it;
	public M(InterThreadCommunication it)
	{
   this.it=it;
	Thread t2=new Thread(this,"M");
	t2.start();
	}
	public void run() 
	{
		int num=0;
		while(true)
		{
			it.put(num++);
			try{Thread.sleep(1000);}catch(Exception e)	{	System.out.println(e);}
		}		
	}	
}

class Y implements Runnable
{	
	InterThreadCommunication it;
	public Y(InterThreadCommunication it)
	{
		this.it=it;
		Thread t1=new Thread(this,"Y");
		t1.start();
	}
	public void run() 
	{
		while(true)
		{
			it.get();
			try{Thread.sleep(500);}catch(Exception e)	{	System.out.println(e);}
		}
	}	
}


