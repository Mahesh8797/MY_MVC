package Collections_LIST;
import java.util.*;
public class LinnkedList_ArrayToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[]={4,6,8,2,7};	
		
		//first approach
		List<Integer> list=new LinkedList<>(Arrays.asList(arr));
		System.out.println(list);
		
		//second approach
		List<Integer> l=new LinkedList<>();
		for(Integer i: arr)
		{
			l.add(i);
		}
		System.out.println(l);		
		
		List<String> li=new LinkedList<>();
		li.add("a");
		li.add("c");
		li.add("d");
		
		String arr1[]=new String[li.size()];
		arr1=li.toArray(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
