package Collections_SET;
import java.util.*;

public class Tree_Set {
	public static void main(String[] args) {
		
		SortedSet<String> books=new TreeSet<>();		
		books.add("maths");
		books.add("phyiscs");
		books.add("english");
		books.add("biology");
		System.out.println(books);
	}
}
