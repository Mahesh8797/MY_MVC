package Collections_LIST;

import java.util.*;

public class ArrayList_ConcExepNOUsingListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("irk");
		list.add("ghi");
		
		ListIterator<String> lt=list.listIterator(list.size());
		while(lt.hasPrevious())
		{
			String l=lt.previous();
			System.out.print(l +"  ");
			if(l.equals("def"))
			{
				lt.remove();
				lt.add("hello");
			}
		}
		System.out.println();
		 System.out.println(list);
	}
	 
}
