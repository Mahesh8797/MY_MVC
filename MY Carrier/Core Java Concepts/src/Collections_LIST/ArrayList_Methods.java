package Collections_LIST;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vowels=new ArrayList<>();
		vowels.add("a");
		vowels.add("b");
		vowels.add("c");
		vowels.add("d");
		vowels.add("a");
		vowels.add("c");
		System.out.println(vowels);
		System.out.println(vowels.indexOf("a"));  //returns first occurence of a
		System.out.println(vowels.lastIndexOf("c"));  //returns last occurence of c
		List<String> li=vowels.subList(1, 5); //similar to substring 
		System.out.println(li);
	}

}
