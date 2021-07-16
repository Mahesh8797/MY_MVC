package StringConcepts;

public class PoolandIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mahe";
		String s2="mahe";
		String s3="yoge";
		String s4=new String("yoge");
		System.out.println("Reference is same");
		System.out.println(s1==s2);
		System.out.println("Reference is diff");
		System.out.println(s1==s3);
		System.out.println("Reference is diff");
		System.out.println(s3==s4);
		s4=s4.intern();
		System.out.println("Reference is same");
		System.out.println(s3==s4);
		
	}

}
