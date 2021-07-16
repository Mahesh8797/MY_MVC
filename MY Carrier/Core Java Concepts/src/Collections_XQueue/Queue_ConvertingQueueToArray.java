package Collections_XQueue;
import java.util.*;
public class Queue_ConvertingQueueToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue=new LinkedList<>();
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		System.out.println(queue);
		
		Integer arr[]=new Integer[queue.size()];
		arr=queue.toArray(arr);
		System.out.println(Arrays.toString(arr));

	}
}
