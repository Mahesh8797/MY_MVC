package Collections_SET;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
public class ConcModifException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		set.add("school");
		set.add("collage");
		set.add("office");
		set.add("home");
		Iterator<String> itr=set.iterator();
		//will throw error as itr.hasNext() will return true but there is no value if the value we are removing is last element then no issues
		/*while(itr.hasNext())
		{
			String list=itr.next();
			System.out.println(list);
			if(list.equals("office"))
				set.remove("office");			
		}*/
		
		//to avoid concurrent modification exception
		while(itr.hasNext())
		{
			String list=itr.next();
			System.out.println(list);
			if(list.equals("office"))
				itr.remove();	 //it removes the data from itr first and then goes to set so no error will be thrown
		}
		System.out.println(set);
		
			}

}
