package StringConcepts;

public class StringSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="www.mahyog.com";
		System.out.println("The actual string  is "+s);
		System.out.println("The last 4 characters of the string "+ s.subSequence(s.length()-4, s.length()));
		System.out.println("The first 4 characters fo the string "+ s.subSequence(0, 4));
		System.out.println("I want only the website name "+ s.subSequence(4,10));
		//== refers to the object and reference of the string here s.substirng value gets reference different than the other one hence it returns false
		System.out.println("substring == subsequence "+ (s.substring(4,10)==s.subSequence(4, 10)));
		//equals method looks for the content of both the strings and compare and hence returns true
		System.out.println("substring equals subsequence "+s.substring(4, 10).equals(s.subSequence(4, 10)));		
	}

}
