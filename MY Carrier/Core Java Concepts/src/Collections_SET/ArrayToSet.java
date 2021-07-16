package Collections_SET;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first approach using intermedaite list
		String arr[]={"a","e"}; //,'i','o','u'};
		Set<String> vowels= new HashSet<>(Arrays.asList(arr));
		System.out.println(vowels);

		//second approach using copy method
		String arr1[]={"a","e"};
		Set<String> vow=new HashSet<>();
		Collections.addAll(vow, arr1);
		System.out.println(vow);
		
	}

}
