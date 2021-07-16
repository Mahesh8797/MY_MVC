package StringConcepts;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Mahe";
		s1=s1+"y";
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("hi");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("arthi");
		sb1.append("y");
		System.out.println(sb1);
		
		//here both performs +operand but in concat we create a new reference to the exiting string so the old string value goes into garbage
		//where as in stringbuffer less garbage will go to heap and the processing speeed will be high
		
	}

}
