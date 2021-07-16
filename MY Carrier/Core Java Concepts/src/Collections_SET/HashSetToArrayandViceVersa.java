package Collections_SET;
import java.util.*;
public class HashSetToArrayandViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]={"ABC","DEF","HUI"};
		Set<String> set=new HashSet<>(Arrays.asList(arr));
		System.out.println(set);
		
		Set<String>s=new HashSet<>();
		s.add("m");
		s.add("a");
		s.add("h");
		s.add("e");
		
		String a[]=new String[s.size()];
		a= s.toArray(a);
		System.out.println(Arrays.toString(a));
				

	}

}
