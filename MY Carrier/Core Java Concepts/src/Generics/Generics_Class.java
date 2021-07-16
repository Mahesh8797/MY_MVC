package Generics;

//if i want the class to have only the number type then we can extend it
//Integer, Float, Double all extends Number class
class Mahesh<T extends Number>
{
	T age;
	T name; //we can't pass the string value here as it is of type string but the class is of type Integer
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}	
	
}
public class Generics_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mahesh<Integer> m=new Mahesh<Integer>();
		m.setAge(23);
				
		System.out.println("Age is " +m.getAge());
		
	}

}
