import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

class mahesh implements Comparable<mahesh>
{
	String name;
	int age;
	String location;
	public mahesh(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public int compareTo(mahesh o) {
		
		if(this.age > o.age)
		{
			return 1;
		}
		return -1;
	}

	public String toString() 
	{
		return " [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
		
}
public class CollectionsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]={"a","e","i","o"};
		Set<String> set=new HashSet<>(Arrays.asList(arr));
		System.out.println(set);
		String ar[]=set.toArray(new String[set.size()]);
		System.out.println(Arrays.toString(ar));
		
		Set<mahesh> s=new TreeSet<mahesh>();
		s.add(new mahesh("Dhana",47,"Madipakkam"));
		s.add(new mahesh("Rathna",43,"kuber nagar"));
		s.add(new mahesh("Shanthi",50,"Triplicane"));
		s.add(new mahesh("Paru",70,"kuber"));
		for(mahesh m: s)
		{
			System.out.println(m);
		}	
		System.out.println();
		List<mahesh> li=new ArrayList<mahesh>(s);		
		Comparator<mahesh> com=(x,y)->{ return x.getName().compareTo(y.getName());};
		
		Collections.sort(li,com);	
		Iterator<mahesh> it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		Set<Integer> sets=new CopyOnWriteArraySet<>();
		sets.add(5);
		sets.add(6);
		sets.add(7);
		sets.add(8);
		sets.add(9);
		
		Iterator<Integer> itr=sets.iterator();
		while(itr.hasNext())
		{
			Integer st=itr.next();
			System.out.println(st);
			if(st==7)
			{
				sets.remove(st);
				sets.add(121);
			}
		}
		System.out.println(sets);
		
	}

}
