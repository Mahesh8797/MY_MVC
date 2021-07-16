package Collections_MAP;
import java.util.*;
public class TreeMap_NavigableMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> map=new TreeMap<>();
		for(int i=0;i<10;i++)
		{
			map.put(i, i);
		}
		System.out.println("Actual map : "+map);
		Map.Entry<Integer, Integer> entry;
		entry=map.lowerEntry(6);
		System.out.println("Lower entry of 5 : " +entry);
		entry=map.higherEntry(6);
		System.out.println("Higher entry of 5 : "+entry);
		System.out.println("Lower key of 5 : "+map.lowerKey(5));
		entry=map.floorEntry(4);
		System.out.println("Floor entry of 4 : "+entry);
		entry=map.ceilingEntry(5);
		System.out.println("Ceiling entry of 5 : "+entry);
		entry=map.firstEntry();
		System.out.println("First entry of 4 : "+entry);
		entry=map.lastEntry();
		System.out.println("Last entry of 4 : "+entry);
		System.out.println("Reversing the map : "+map.descendingMap());
		entry=map.pollFirstEntry();
		System.out.println("Removing first entry : "+entry);
		entry=map.pollLastEntry();
		System.out.println("Removing lst entry : "+entry);
		System.out.println("Subset from 2 to 7 where both are included "+ map.subMap(2,true, 7,true));
		System.out.println("Head map : "+map.headMap(5,true));
		System.out.println("Tail Map : "+map.tailMap(6, true));
	}
}
