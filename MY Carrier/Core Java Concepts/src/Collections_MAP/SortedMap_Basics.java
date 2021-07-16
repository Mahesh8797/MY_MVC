package Collections_MAP;
import java.util.*;

class MY implements Comparable<MY>
{
	int age;
	String occup;
	String relation;
	public MY(int age, String occup, String relation) {		
		this.age = age;
		this.occup = occup;
		this.relation = relation;
	}
	
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public int compareTo(MY arg0) {
		
		return this.getRelation().compareTo(arg0.getRelation());
	}
	public String toString()
	{
		return age + " , "+occup+ " , "+relation;
	}
	
}
public class SortedMap_Basics{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<String, MY> map=new TreeMap<>();
		map.put("Dhana", new MY(48,"Business","father"));
		map.put("Kanni", new MY(45,"Home maker","mother"));
		map.put("Mani", new MY(18,"Student","Brother"));
		
		Set<Map.Entry<String, MY>> set=map.entrySet();
		for(Map.Entry<String, MY> s: set)
		{
			System.out.println(s.getKey() +"-> "+ s.getValue() );
		}
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap("Mani"));
		System.out.println(map.tailMap("Dhana"));
		
	}
}
