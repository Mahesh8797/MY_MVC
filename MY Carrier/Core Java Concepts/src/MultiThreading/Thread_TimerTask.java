package MultiThreading;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Thread_TimerTask extends TimerTask {

	public void run()
	{
		System.out.println("Timer started at : "+new Date());
		  try { Thread.sleep(20000);} catch (Exception e) {}   //timer takes 20 seconds to complete the task
		  System.out.println("Timer stopped at : "+new Date());
	}
	public static void main(String[] args) 
	{
		TimerTask timertask=new Thread_TimerTask();
		Timer timer=new Timer(true);
		timer.scheduleAtFixedRate(timertask, 0, 10000); //task is scheduled to run every 10 secs
		try { Thread.sleep(120000);} catch (Exception e) {}  
		timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
