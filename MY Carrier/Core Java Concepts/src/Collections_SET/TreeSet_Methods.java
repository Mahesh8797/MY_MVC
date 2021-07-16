package Collections_SET;

import java.util.*;
public class TreeSet_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Integer> set=new TreeSet<>(Comparator.naturalOrder());
		set.addAll(Arrays.asList(5,8,2,6,4,9));		
		System.out.println(set);
		
		SortedSet<Integer> s=set.subSet(4, 9);
		System.out.println(s);
		
		s=set.headSet(5);
		System.out.println(s);
		
		s=set.tailSet(4);
		System.out.println(s);
		
		System.out.println(set.first());
		System.out.println(set.last());
		

	}

}
