package Collections_ITERATOR;
import java.util.*;
public class ListIteratorExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		List<String> list=new ArrayList<>();
		list.add("Mahe");
		list.add("arthi");
		list.add("Kanni");
		list.add("dhana");
		list.add("yoge");
		
		ListIterator<String> ltr=list.listIterator();
		while(ltr.hasNext())
		{
			String s=ltr.next();
			System.out.println(s);
			if(s.equals("arthi"))
			{		
				ltr.set("bujju");
				ltr.add("thangam");				
			}
		}
		System.out.println();
		System.out.println(list);
		System.out.println();		
		while(ltr.hasPrevious())
		{
			String s1=ltr.previous();
			System.out.println(s1);
		}
		System.out.println();		
	}
}
