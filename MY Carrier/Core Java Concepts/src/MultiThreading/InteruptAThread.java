package MultiThreading;

public class InteruptAThread extends Thread {

	public void run()
	{
		try{ Thread.sleep(5000);}catch(Exception e){e.printStackTrace();}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteruptAThread a=new InteruptAThread();		
		InteruptAThread b=new InteruptAThread();
		a.start();
		try{
		a.interrupt();}
		catch(Exception e){e.printStackTrace();}
		b.start();
	}

}
