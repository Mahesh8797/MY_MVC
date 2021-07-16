package Collections_XQueue;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class Queue_PeekandElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> bq=new ArrayBlockingQueue<>(3);
		bq.add(1);
		bq.add(2);
		bq.add(3);
		System.out.println(bq);
		System.out.println(bq.peek());
		System.out.println(bq.element());
		bq.clear();
		System.out.println(bq.peek());
		System.out.println(bq.element());
	}

}
