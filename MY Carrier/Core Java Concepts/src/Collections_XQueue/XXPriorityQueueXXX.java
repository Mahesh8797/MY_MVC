package Collections_XQueue;

import java.util.*;
public class XXPriorityQueueXXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pro=new PriorityQueue<>(Comparator.naturalOrder());
		pro.add(5);
		pro.add(1);
		pro.add(9);
		pro.add(2);
		pro.add(7);
		System.out.println(pro);
		
		Queue<Integer> pr=new PriorityQueue<>(Comparator.reverseOrder());
		pr.addAll(pro);
		System.out.println(pr);
		
		Queue<String> abc=new PriorityQueue<>();
		abc.add("jdf");
		abc.add("fgj");
		abc.add("atr");
		abc.add("ogf");
		System.out.println("Before Polling : "+abc);
		System.out.println(abc.poll());
		//now all the elements will be sorted
		System.out.println("After Polling : "+abc);
				
	}

}
