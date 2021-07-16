package Collections_LIST;

import java.util.*;
public class MethodsOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vowels=new ArrayList<>();
		vowels.add("a");
		vowels.add("b");
		vowels.add("c");
		vowels.add("d");
		vowels.add("e");
		System.out.println(vowels);
		vowels.add("f");
		System.out.println(vowels);
		vowels.set(2, "g"); //replace the value at specified index
		System.out.println(vowels); 
		System.out.println(vowels.get(4));  //returns the value at specified index
		vowels.remove(0);
		System.out.println(vowels); 
		vowels.clear();
		System.out.println(vowels); 
	
	}

}
