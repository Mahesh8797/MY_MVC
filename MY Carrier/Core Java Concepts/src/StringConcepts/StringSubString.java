package StringConcepts;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// begin index inclusive end exclusive
		String s="hope you get well soon";
		System.out.println("printing last four "+ s.substring(s.length()-4));
		System.out.println("Printing the between string "+s.substring(5, 20));
	//Index out of bound exception scenarios
	//1. end index exceeds the length of string
   //2. begin index has negative integer
	//3. begin index is larger than end index
	System.out.println("Printing the between string "+s.substring(5, 30));
		System.out.println("Printing negative index "+s.substring(-2,10));
		System.out.println("exception "+ s.substring(10,3));
		
	}

}
