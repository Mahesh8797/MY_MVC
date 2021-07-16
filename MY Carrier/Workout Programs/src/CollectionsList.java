import java.util.*;
class mahi
{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	String name;
	int age;
	String location;
	public mahi(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	
	
}
public class CollectionsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]={"a","e","i","o"};
		List<String> list=Arrays.asList(arr);  
		System.out.println(list);		
		
		String a[]=new String[list.size()];
		a=list.toArray(a);
		System.out.println(Arrays.toString(a));
		
		List<mahi> li=new ArrayList<mahi>();
		li.add(new mahi("Aarthi",23,"Madipakkam"));
		li.add(new mahi("Kalpana",26,"Ashok nagar"));
		li.add(new mahi("Gaythri",30,"Mylapore"));
		li.add(new mahi("Kanya",33,"Triplicane"));
		
		Comparator<mahi> comp=(b, c)-> {
			
			return b.getLocation().compareTo(c.getLocation());
			         
		       };
							
		Collections.sort(li,comp);	
		li.forEach(x->System.out.println(x));
		System.out.println();
		Iterator<mahi> it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
				
		}
		System.out.println();
		li.set(2, new mahi("Yogs",33,"Coimbatore"));
		Iterator<mahi> itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
				
		}
		//li.remove(0);
		//System.out.print(li);
		
		li.removeIf(d-> {return d.age==26;});
		System.out.print(li);
		
		//li.replaceAll(x-> {return x.age*1;});
		
		List<String> lis=new ArrayList<>(Arrays.asList("dhana","kanni","mani"));
		System.out.println(lis);
		System.out.println();
		List<String> sub=lis.subList(1, 2);
		System.out.println(sub);
		sub.add("aarthi");
		sub.add("paru");
		System.out.println();
		System.out.println(lis + " "+sub);
		sub.add("rathna");
		sub.add("shanthi");
		System.out.println(lis + " "+sub);
		lis.add("rjgo");
		System.out.println(lis + " "+sub);
		
	}

}
