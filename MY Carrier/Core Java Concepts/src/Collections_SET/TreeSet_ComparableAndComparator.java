package Collections_SET;
import java.util.*;

class Male implements Comparable<Male>
{
	private int num;
	private String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Male(int num, String name) {
		
		this.num = num;
		this.name = name;
	}
	@Override
	public int compareTo(Male o)
	{
		
		return this.getName().compareTo(o.getName());
	}
	
	public String toString()
	{
		return "Id " + num + " Name "+name;
	}
	
}

public class TreeSet_ComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Male> ss=new TreeSet<Male>();
		ss.add(new Male(1,"YOGE"));
		ss.add(new Male(4,"LOG"));
		ss.add(new Male(2,"THANGAM"));
		ss.add(new Male(0,"BUJJU"));
		
		System.out.println("Before sorting "+ss);
		System.out.println("Sorting by name");
		
			
		for(Male m: ss)
				System.out.println(m);
		List<Male> list=new ArrayList<>(ss);
		Comparator<Male> comp= new Comparator<Male>()
				{

					@Override
					public int compare(Male o1, Male o2) {
						
						if(o1.getNum() >o2.getNum())
						{
							return 1;
						}
						return -1;
					}
			
				};
				Collections.sort(list,comp);
				System.out.println("Sorting by number");
				for(Male m1: list)
				{
					System.out.println(m1);
				}							

	}

}
