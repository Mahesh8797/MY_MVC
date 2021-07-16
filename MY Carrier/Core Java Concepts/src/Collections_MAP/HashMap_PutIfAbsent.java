package Collections_MAP;
import java.util.*;
public class HashMap_PutIfAbsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>map=new HashMap<>();
		map.put(10, "aa");
		map.put(20, "bb");
		map.put(null, "cc");
		map.put(30, null);
		
		String value;
		System.out.println("The original map "+map);
		value=map.putIfAbsent(20, "dd");
		System.out.println("After modification "+map);
		System.out.println(value);
		
		value=map.putIfAbsent(30, "ff");
		System.out.println("After modification "+map);
		System.out.println(value);
		
		value=map.putIfAbsent(40, "gg");
		System.out.println("After modification "+map);
		System.out.println(value);	
	}
}
