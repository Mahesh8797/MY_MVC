package Java_8_Features;

import java.util.ArrayList;
import java.util.List;

public class LambdaExp_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li=new ArrayList<String>();
		li.add("M");
		li.add("A");
		li.add("H");
		li.add("E");
		
		li.forEach(a->System.out.println(a));
		
	}

}
