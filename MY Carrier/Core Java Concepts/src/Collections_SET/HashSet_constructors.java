package Collections_SET;
import java.util.*;
public class HashSet_constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int initalCapacity=32;
		Set<String> s1=new HashSet<>(); //empty constructor with default capacity 16
		Set<String> s2=new HashSet<>(32); //16*2 32 capacity
		Set<String> s3=new HashSet<>(s2); //passing the argument of set
		Set<String> s4=new HashSet<>(16,0.75f); //capacity and load factor
		Set<String> s5=new HashSet<>(Arrays.asList("34","54"));
		System.out.println(s5);
		
	}

}
