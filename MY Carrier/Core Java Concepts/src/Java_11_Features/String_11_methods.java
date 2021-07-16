package Java_11_Features;

import java.util.stream.Collectors;

public class String_11_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//isBlank()
		String s1="hell";
	//	System.out.println("Is string blank "+s1.isBlank());
		String s2="";
		//System.out.println("Is string blank "+s2.isBlank());
		
		//lines()
		String s3="hello/All/welcome/you";
		System.out.println(s3);
	//	List<String> list=s3.lines().collect(Collectors.toList());
	//	System.out.println(list);
		
		//strip()
		String s4="java \t world";
		System.out.println(s4);
	//	System.out.println("#" +s4.strip()+ "#");
	//	System.out.println("#" +s4.stripLeading()+ "#");
	//	System.out.println("#" +s4.stripTrailing()+ "#");
		
		//repeat()
		String s5="hello";
	//	System.out.println(s5.repeat(3));
	}

}
