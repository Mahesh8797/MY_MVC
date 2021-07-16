package Collections_MAP;
import java.util.*;
import java.util.Map.Entry;
public class Map_HashMap_EntrySetAndIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Character> map=new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'd');
		map.put(5, 'e');
		map.put(null, '3');
		map.put(null, null);
		System.out.println(map);
		Set<Map.Entry<Integer, Character>> set=map.entrySet();
		for(Map.Entry<Integer, Character> s: set)
		{
			System.out.println("Key : " +s.getKey() + " Value : "+ s.getValue());
		}
		System.out.println(set);
		Iterator<Entry<Integer, Character>> itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, Character> text;
			text=itr.next();
			System.out.println(text.getKey() + " "+text.getValue());
			
			if(text.getKey()==null)
			{
				itr.remove();
			}
		}
		System.out.println(map);						
	}
}
