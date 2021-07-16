package Collections_SET;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcExceptionAvoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new CopyOnWriteArraySet<String>();
		s.add("school");
		s.add("collage");
		s.add("office");
		s.add("home");
		Iterator<String> iterrator=s.iterator();
		while(iterrator.hasNext())
		{
			String list=iterrator.next();
			System.out.println(list);
			
			if(list.equals("office"))
			{
				s.remove("office");	 
			s.add("Mall");//it removes the data from itr first and then goes to set so no error will be thrown
		}
		}
		System.out.println(s);

	}

}
