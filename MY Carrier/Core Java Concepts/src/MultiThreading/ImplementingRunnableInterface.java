package MultiThreading;
class C implements Runnable
{	
	public void run()
	{
			for(int i=0;i<3;i++)
			{
				System.out.println("Hiiii");
				try{Thread.sleep(500);}catch(Exception e)	{	System.out.println(e);}
			}
	}	
}
class D implements Runnable
{

	public void run()
	{		
		for(int i=0;i<3;i++)
		{
			System.out.println("Helloooo");
			try{Thread.sleep(500);}catch(Exception e)	{	System.out.println(e);}
		}
	}	
}

public class ImplementingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C();
		D d=new D();
		Thread t1=new Thread(c);
		Thread t2=new Thread(d);
		t1.start();
		t2.start();
	}

}
