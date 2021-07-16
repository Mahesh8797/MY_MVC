package Java_8_Features;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPI_TerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reduce - we can use reduce to perform reduction operation on stream and returns optional value
		Stream<Integer> st1=Stream.of(1,4,6,8);
		Optional<Integer> intOpt= st1.reduce((i, j)->{ return i*j;}); //i can perform any binary operation here
		if(intOpt.isPresent())
		{
			System.out.println(intOpt.get());
		}
		
		//for each - to iterate the elements in the stream
		st1=Stream.of(1,4,6,8);
		st1.forEach((i)->System.out.println(i));
		
		//count- is used to count the number of elements in the stream
		st1=Stream.of(1,4,6,8);
		System.out.println("Count is "+st1.count());
		
		//match operations
		st1=Stream.of(1,4,6,8);
		System.out.println("If any of the match is found "+st1.anyMatch(i-> i==6));
		st1=Stream.of(1,4,6,8);
		System.out.println("If any of the match is found "+st1.allMatch(i-> i<10));
		st1=Stream.of(1,4,6,8);
		System.out.println("If any of the match is found "+st1.noneMatch(i-> i==11));
		
		//findFirst
		Stream<String> stream=Stream.of("Mahe","Yoge","Jaya","YMahe");
		Optional<String>  value=stream.filter(s->s.startsWith("Y")).findFirst();
		if(value.isPresent())
		{
			System.out.println("The value is "+value.get());
		}
	}

}
