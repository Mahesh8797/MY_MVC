package Java_8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamAPI_WaystoCreateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> stream= Stream.of(1,3,3,5,7);
		stream.forEach(System.out::println);
		
		Stream<Integer> st=Stream.of(new Integer[]{1,5,67,86,34}); //new Int[] will give error as it does not support primitive types
		System.out.println(st); //stream will not store the data anywhere
		st.forEach((s)->System.out.println(s));
		
		List<Integer> list=new ArrayList<>(Arrays.asList(3,4,5,6,7));
		System.out.println(list);
		Stream<Integer> seq=list.stream();
		seq.forEach(System.out::println);
		Stream<Integer> par=list.parallelStream();
		par.forEach(System.out::println);
		
		Stream<String> s1=Stream.generate( ()->{ return "Hi";}); //returns infinite sequential unordered stream provided by supplier
		s1.forEach(System.out::println);
	    Stream<String> s2=Stream.iterate("mahe", (i)-> i); //returns infinite sequential ordered stream 
	    s2.forEach(System.out::println);


		LongStream ls=Arrays.stream(new long[]{45,4523,456,3456});
		IntStream is="YOGESH".chars();  //Prints the ascii value of each characters
		ls.forEach(System.out::println);
		is.forEach(System.out::println);
	}

}
