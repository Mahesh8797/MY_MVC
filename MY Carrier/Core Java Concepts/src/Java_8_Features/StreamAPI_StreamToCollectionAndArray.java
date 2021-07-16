package Java_8_Features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_StreamToCollectionAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> stream=Stream.of(4,6,7,3,9);
		List<Integer> list=stream.collect(Collectors.toList());
		System.out.println(list);
		
		stream=Stream.of(4,6,7,3,9);
		Map<Integer, Integer> map=stream.collect(Collectors.toMap(i->i, (i)->i+10));
		System.out.println(map);
		
		Stream<Integer> str=Stream.of(4,6,7,3,9);
		Integer arr[]=str.toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));
		
	}

}
