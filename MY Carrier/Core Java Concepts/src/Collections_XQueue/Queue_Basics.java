package Collections_XQueue;

import java.util.*;
public class Queue_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue=new LinkedList<>();
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);
		System.out.println(queue.size());
		queue.remove(4);
		System.out.println(queue);
		queue.clear();
		System.out.println(queue);
	}
}
