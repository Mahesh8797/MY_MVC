package Collections_ITERATOR;

import java.util.*;
class Mahe
{
	private int id;
	private String name;
	private int age;
	public Mahe(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "ID : "+ id +" Name : "+name+ " Age : "+age;
	}
	
}
public class CustomClassIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Mahe> ln=new LinkedList<Mahe>();
		ln.add(new Mahe(10,"Aarthi",23));
		ln.add(new Mahe(12,"Kalpana",26));
		ln.add(new Mahe(14,"Gayathri",30));
		ln.add(new Mahe(16,"Kanya",33));
		
		
		Iterator<Mahe> iterator=ln.iterator();
		{
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
		}	
		//it will print the same value
		for(Mahe m: ln)
		{
			System.out.println(m);
		}

	}

}
