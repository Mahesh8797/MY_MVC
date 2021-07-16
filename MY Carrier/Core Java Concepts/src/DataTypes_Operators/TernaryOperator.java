package DataTypes_Operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c;
		c= a>b? a: b;
		System.out.println(c);
		
		String name="MYMYM";
		String result;
		String last;
		result=name.contains("Y")? "mine": "not mine";
		System.out.println(result);
		
		last= name.contains("MY")? "definitely mine" : (a==10)? " mine": "noo";
		
		System.out.println(last);
		
	}

}
