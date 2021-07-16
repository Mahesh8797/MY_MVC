package Collections_XQueue;

import java.util.*;
public class Queue_ConvertingArrayToQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String arr[]={"ab","cd","de","ef"};
		
		Queue<String> queue=new LinkedList<>();
		for(String s: arr)
		{
			queue.add(s);
		}
		System.out.println(queue);
		
		Queue<String> q=new LinkedList<>();
		Collections.addAll(q, arr);
		System.out.println(q);		
	}

}
