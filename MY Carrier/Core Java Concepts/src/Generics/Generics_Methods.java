package Generics;

import java.util.ArrayList;

class Yogesh<T extends Number>
{
	T age;
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}	
	
	public void sum(ArrayList<? extends Number>list)//here i cant put numbers but i can extend it
	  //  or sum(ArrayList<? super T>list)
	{
		list.add(null);
		System.out.println(list);
		//note that here we can extend Superclass or if we use super ? should be of type superclass
	}
}
public class Generics_Methods {

	public static void main(String[] args) {
		Yogesh<Integer> m=new Yogesh<Integer>();
		m.setAge(33);				
		System.out.println("Age is " +m.getAge());
		
		m.sum(new ArrayList<Integer>(1));
	}

}
