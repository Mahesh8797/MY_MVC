package UseCases;
import java.util.*;
class Vote extends Thread
{
	static int value1=0;
	static int value2=0;
	static int value3=0;
	static int value4=0;
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Enter the id of the person you wish to vote");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		switch(id)
		{
		case 100:
			value1++;
			break;
		case 101:
			value2++;
			break;
		case 102:
			value3++;
			break;
		case 103:
			value4++;
			break;
		}
	    }
		System.out.println("The person who's id is 100 having vote count "+value1);
		System.out.println("The person who's id is 101 having vote count "+value2);
		System.out.println("The person who's id is 102 having vote count "+value3);
		System.out.println("The person who's id is 103 having vote count "+value4);		
			
	}
}

public class VotingMechanism extends Vote {
	
	public static void main(String[] args) {

		Vote v1=new Vote();
		Map<Integer,String> map=new Hashtable<Integer,String>();
		map.put(100, "Stalin");
		map.put(101, "Edapadi");
		map.put(102, "RahulGandhi");
		map.put(103, "Modi");
		System.out.println("---------------------------------------");
		
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=set.iterator();
		{
			while(itr.hasNext())
			{
				Map.Entry<Integer,String> m=itr.next();
				System.out.println("ID |"+m.getKey() +"|" + " Value |"+ m.getValue());
			}
		}
		
		v1.start();
		try
		{
			Thread.sleep(20000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		Map<Integer,String> m=new Hashtable<Integer,String>();
		m.put(100, "Stalin");
		m.put(101, "Edapadi");
		m.put(102, "RahulGandhi");
		m.put(103, "Modi");
		System.out.println("---------------------------------------");
		
		Set<Map.Entry<Integer,String>> s=m.entrySet();
		for(Map.Entry<Integer, String> m1:s)
		{		
			switch(m1.getKey())
			{
			case 100:
				System.out.println("ID |"+m1.getKey() +"|" + " Value |"+ m1.getValue()+"       |" +"Count |"+v1.value1);
				break;
			case 101:
				System.out.println("ID |"+m1.getKey() +"|" + " Value |"+ m1.getValue()+"       |" +"Count |"+v1.value2);
				break;
			case 102:
				System.out.println("ID |"+m1.getKey() +"|" + " Value |"+ m1.getValue()+" |" +"Count |"+v1.value3);
				break;
			case 103:
				System.out.println("ID |"+m1.getKey() +"|" + " Value |"+ m1.getValue()+"      |" +"Count |"+v1.value4);
				break;
			}
			
		}
				
	}
}


