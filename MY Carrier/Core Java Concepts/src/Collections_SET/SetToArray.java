package Collections_SET;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> vowels=new LinkedHashSet<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");		
		System.out.println(vowels);
		String arr[]= vowels.toArray(new String[vowels.size()]);
		System.out.println(Arrays.toString(arr));
	}

}
