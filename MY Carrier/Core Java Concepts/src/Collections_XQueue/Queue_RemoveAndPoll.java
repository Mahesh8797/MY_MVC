package Collections_XQueue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class Queue_RemoveAndPoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<String> queue=new ArrayBlockingQueue<>(4);
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		System.out.println(queue);
		queue.remove("c");
		System.out.println(queue);
		queue.poll();  //removes first element
		System.out.println(queue);
		queue.clear();
		System.out.println(queue.poll());
		System.out.println(queue.remove());

	}

}
