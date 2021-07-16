package StringConcepts;
public class StringMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="maheshwari";
		s1.concat("Y"); //as string is immuatable the concat will not occur here
		System.out.println(s1);
		s1=s1.concat("y");
		System.out.println(s1);
		String s2="maheshwari";
		System.out.println(s2.contains("hesh"));
		System.out.println(s2.endsWith("i"));	
		System.out.println(s2.endsWith("wari"));
		String s3="MAHESHWARI";
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
	    System.out.println( String.format("value is %s",s3)); //we have %d , %x and many
	    int value=101;
	    System.out.println(String.format("value is %x",value));
	    System.out.println(s3.indexOf("RI"));
	    System.out.println(s3.indexOf("H"));
	    System.out.println(s3.lastIndexOf('H'));
	    String s4="";
	    System.out.println(s4.isEmpty());
	    System.out.println(s4.join("/", "28","03","2020")); //joining with delimiters
	    System.out.println(s2.replaceAll("h", "a"));
	    System.out.println(s3.startsWith("MA"));
	    System.out.println(s2.toUpperCase());
	    System.out.println(s3.toLowerCase());
	    String s5=" I am not new to Java ";
	    System.out.println("Before tirimming "+s5.length());
	    String s6= s5.trim();
	    System.out.println(s6);
	    String s8= null; //null pointer exception
	   // String s9=s8.trim();
	    System.out.println(s8); //if we are printing without trim then it will take the  null value
	    System.out.println("After tirimming "+s6.length());
	    int high=30;
	    String s7=String.valueOf(high); //converts any of the primitives types to String
	    System.out.println(s7+10);	        
	}
}
