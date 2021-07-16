package Java_8_Features;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamAPI_IntermediateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//filter;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<50;i++)
		{
			list.add(i);
		}
		Stream<Integer> stream=list.stream();
		Stream<Integer> high=stream.filter(p->p>=40);
		System.out.println("The values greater than 40");
		high.forEach(p->System.out.println(p));
		
		//map- is used to map the functions to the elements of stream
		Stream<String> st=Stream.of("jfg","aet","t434","kgs","435365");
		System.out.println(st.map(s-> {return s.toUpperCase();}).collect(Collectors.toList()));
		
		//flatMap -is used to create a stream from the stream of list
		Stream<List<String>> st1=Stream.of(Arrays.asList("MAHE"),Arrays.asList("Yoge"),Arrays.asList("MY"));
		Stream<String> str=st1.flatMap(lis->lis.stream());
		str.forEach(System.out::println);
		
		//sorted
		Stream<String> s2=Stream.of("jfg","aet","t434","kgs","gjj");
		System.out.println(s2.sorted().collect(Collectors.toList()));
		s2=Stream.of("jfg","aet","t434","kgs","gjj");
		System.out.println(s2.sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		
	}

}
