package MultiThreading;
public class InterThreadComm {

	String name[]={"Mahe", "Yoge","Jayameena","Judi","Jeni"};
	int age[]={22,32,23,23,23};
	boolean value=false;
	public void getName()
	{
		for(int i=0;i<name.length;i++)
		{
			while(value)
			{
				try{wait();}catch(Exception e)	{	System.out.println(e);}
			}
		System.out.println("Name : "+name[i]);
		try{Thread.sleep(1000);}catch(Exception e)	{	System.out.println(e);}
		
	}
	}
	public void getAge()
	{
		for(int i=0;i<age.length;i++)
		{
		System.out.println("Age : "+age[i]);
		try{Thread.sleep(1000);}catch(Exception e)	{	System.out.println(e);}		
		}		
	    }
	
	public static void main(String[] args)
	{
		InterThreadComm itr=new InterThreadComm();
		new Names(itr);
		new Age(itr);
	}

}
class Names extends Thread
{
	InterThreadComm itr;
	Names(InterThreadComm itr)
	{
		this.itr=itr;
		Thread t1=new Thread( this,"Names");
		t1.start();		
	}
	public void run()
	{
		
	itr.getName();
	try{Thread.sleep(1000);}catch(Exception e)	{	System.out.println(e);}
	}				
}

class Age extends Thread
{
	InterThreadComm itr;
	Age(InterThreadComm itr)
	{
		this.itr=itr;
		Thread t2=new Thread(this,"Age");
		t2.start();
	}
	public void run()
	{		
		itr.getAge();	
		try{Thread.sleep(1000);}catch(Exception e)	{	System.out.println(e);}
	}			
	}	


