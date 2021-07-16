package Access_Specifiers;


final class FinalExamples {
	
	final int num=10;
	//num=20;
	final String name;
	final String hi="hello";
	//hi="mie";
	
	FinalExamples()
	{
		name="mahe";
	}
	static final String second;
	static
	{
		second="yoge";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalExamples fe=new FinalExamples();
		//fe.num=20;
		System.out.println("first name : "+fe.name+ " last name : "+second);
		System.out.println(fe.num+10);
		
	}

}
//class sam extends FinalExamples
//{
	
//}
