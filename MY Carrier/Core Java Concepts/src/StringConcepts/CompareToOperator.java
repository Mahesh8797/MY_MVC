package StringConcepts;

public class CompareToOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s1="ABC";
		String s2="HIJ";
		String s3="abc";
		String s4="HIJ";
		System.out.println(" returning negative integer value "+ s1.compareTo(s2));
		System.out.println("returning true or false for ignore case "+s1.compareToIgnoreCase(s3));
		System.out.println("returning 0 value "+ s2.compareTo(s4));
		System.out.println("returning positive integer value "+s4.compareTo(s1));
		//here it compares only the first char value of the string and returns the result	
		String s5="AAABCD";
		String s6="AADBCD";
		System.out.println("just for understanding "+s5.compareTo(s6));
		//here it compares first two AA and then compare A with D and returns the value
		

	}

}
