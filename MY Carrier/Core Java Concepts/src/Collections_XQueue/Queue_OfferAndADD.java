package Collections_XQueue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class Queue_OfferAndADD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<String> queue=new ArrayBlockingQueue<>(3);
		queue.add("a");
		queue.add("b");
		queue.add("c");		
		System.out.println(queue);
		System.out.println(queue.offer("f"));	//when the array is blocked by size 3 it prints false for offer method when trying to add another element	
		
		queue.add("e");
		//System.out.println(queue);								
	}

}
