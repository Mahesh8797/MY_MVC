package Collections_STACK;
import java.util.*;
public class Stack_Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Converting array to Stack
		Integer [] arr={3,4,5,6};
		Stack<Integer> s1=new Stack<>();
		for(Integer i: arr)
		{
			s1.push(i);
		}		
		System.out.println(s1);
		
		//2.Converting list to stack
		List<Integer> list=new ArrayList<>(Arrays.asList(6,7,8,9));
		Stack<Integer> s2=new Stack<>();
		s2.addAll(list);
		System.out.println(s2);
		
		//3.Converting Stack to List
		Stack<Integer> s3=new Stack<>();
		s3.push(10);
		s3.push(11);
		s3.push(12);
		List<Integer>l=new ArrayList<>();
		l.addAll(s3);
		System.out.println(l);
		
	}

}
