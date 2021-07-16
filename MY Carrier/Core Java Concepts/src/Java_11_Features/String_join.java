package Java_11_Features;

import java.util.*;
public class String_join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList(new String[]{"mahe","weds","y"});
		String combine=String.join(" ",list);
		System.out.println(combine);
	}

}
