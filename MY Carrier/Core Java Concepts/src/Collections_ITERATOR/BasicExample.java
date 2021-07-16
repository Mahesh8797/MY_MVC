package Collections_ITERATOR;

import java.util.*;
public class BasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<>();
		set.add("abc");
		set.add("def");
		set.add("hij");
		set.add("klm");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
			if(s.equals("hij"))
			{
				itr.remove();
			}			
		}
		System.out.println(set);
	}

}
