package Collections_SET;

import java.util.*;
public class Set_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		set.add("a");
		set.add("e");
		set.add("i");
		set.add("o");
		set.add("u");
		System.out.println(set);
		System.out.println("size of set :"+ set.size());
		set.remove("u");
		System.out.println(set);
		//adding another set should be of same type string and if it is integer then compile error is thrown
		Set<String> si=new HashSet<>();
		si.add("2");
		si.add("3");
		set.addAll(si);
		System.out.println(set);
		set.clear();
		System.out.println("Empty set "+set);
	}

}
