package Collections_LIST;

import java.util.*;
public class ArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st approach
		String arr[]={"a","e","i","o"};
		List<String> list=Arrays.asList(arr);
		System.out.println(list);
		
		//2nd approach
		List<String> li=new ArrayList<>();
		for(String s: arr)
		{
			li.add(s);			
		}
		System.out.println(li);
		List<String> l=new ArrayList<>();
		Collections.addAll(l, arr);
		System.out.println(li);
	}

}
