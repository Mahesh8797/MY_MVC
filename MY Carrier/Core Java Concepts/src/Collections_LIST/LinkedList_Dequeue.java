package Collections_LIST;
import java.util.*;
public class LinkedList_Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> list=new LinkedList<>();
		list.add(20);
		System.out.println(list);
		list.addFirst(10);
		list.addLast(25);
		System.out.println(list);
		list.addFirst(5);
		list.addLast(30);
		System.out.println(list);
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		list.offerFirst(0);
		list.offerLast(35);
		System.out.println(list);
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		System.out.println(list);
		list.clear();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}

}
