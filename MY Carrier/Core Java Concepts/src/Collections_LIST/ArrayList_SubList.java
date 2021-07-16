package Collections_LIST;

import java.util.*;
public class ArrayList_SubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("Mahe");
		list.add("Aarthi");
		list.add("Kalp");
		list.add("Kanya");
		list.add("Gay");		
		System.out.println(list);
		List<String> sublist=new ArrayList<>();
		sublist=list.subList(1, 4);
		System.out.println(sublist);
		
		list.set(0, "Aarthi");
		System.out.println(list + " "+ sublist);
						
		sublist.add("krithi");
		System.out.println(list + " "+ sublist);	
		
		list.add("thanu");
		System.out.println(list + " "+ sublist);		
	}
}
