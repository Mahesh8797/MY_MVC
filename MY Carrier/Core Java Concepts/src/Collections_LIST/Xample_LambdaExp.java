package Collections_LIST;
import java.util.*;
import java.util.function.Consumer;

public class Xample_LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("abc");
		list.add("ghi");
				
		list.forEach( (x)->System.out.println("Processed " +x) );
		
		Consumer<String> consumer= x -> System.out.println(x);
		list.forEach(consumer);
		
		Consumer<String> con= new Hello();
		list.forEach(con);
	}

}

class Hello implements Consumer<String>
{

	@Override
	public void accept(String arg0) {
		
		System.out.println("processing "+ arg0);
		
	}

	
}