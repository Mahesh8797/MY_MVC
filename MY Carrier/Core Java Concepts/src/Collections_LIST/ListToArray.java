package Collections_LIST;

import java.util.*;
public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("M");
		list.add("Y");
		list.add("A");
		list.add("O");
		list.add("H");		
		
		String arr[]=new String[list.size()];
		arr=list.toArray(arr);
		System.out.println(Arrays.toString(arr));		
		Iterator<String>  it= list.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
	}

}
