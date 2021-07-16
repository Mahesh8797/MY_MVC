package Collections_LIST;

import java.util.*;
public class _ArrayListConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>(); //empty argument
		list.add(4);
		list.add(3);
		list.add(3);
		List<String> li=new ArrayList<>(3400); //capacity of list
		
		List<Integer> love=new ArrayList<>(list);
		System.out.println(love);
		
		List<String> l=new ArrayList<>(null); //returns null pointer exception when the collection argument is null
		System.out.println(l);
	}

}
