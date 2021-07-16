package Collections_SET;

import java.util.*;

public class SortinganHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ss=new HashSet<>();
		ss.add("mahe");
		ss.add("aarthi");
		ss.add("yoge");
		ss.add("jayameena");
		ss.add("jayameena"); //duplicates does not throw error but gets ignored
		//ss.add(null);
		System.out.println("Before sorting");
		Iterator<String> it=ss.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ss.add("hello");
		//Collections.sort(ss);
		System.out.println(ss);
		//we cannot sort the set directly first we must convert it into a list and then sort the list
		List<String> list=new ArrayList<>(ss);
		Collections.sort(list);
		System.out.println("After sorting");
		Iterator<String> ite=list.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		//sorting the numbers
		Set<Integer> set=new LinkedHashSet<>();
		set.add(5);
		set.add(3);
		set.add(6);
		set.add(1);
		
		List<Integer> li=new ArrayList<>(set);
		Collections.sort(li);
		System.out.println(li);
		

	}

}
