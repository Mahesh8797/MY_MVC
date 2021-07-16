package MultiThreading;
class A extends Thread
{
	public void run()
	{
		int i=10;
		for( i=0;i<=10;i++)
		{
			if(i%2==0)
			System.out.println(i);
			try{Thread.sleep(500);}catch(Exception e)	{	System.out.println(e);}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		int i=10;
		for( i=0;i<=10;i++)
		{
			if(i%2!=0)
			System.out.println(i);	
			try{Thread.sleep(500);}catch(Exception e)	{	System.out.println(e);}
		}
	}
}
public class ExtendingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		B b=new B();
		
		a.start();		
		b.start();
		
	}

}
