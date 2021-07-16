package Generics;

import java.util.*;
public class Generics_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lis=new ArrayList<>();
		lis.add(3);
		lis.add(7);
		lis.add(4);
		
		System.out.println(lis);
		List list=new ArrayList();
		list.add(7);
		list.add(4);
		list.add("Mahe");
		
		int i=Integer.parseInt(list.get(2).toString());
	}

}
