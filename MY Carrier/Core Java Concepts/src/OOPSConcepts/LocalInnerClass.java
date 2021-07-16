package OOPSConcepts;

public class LocalInnerClass {

	int a=10;
	String name="hello";
	void method()
	{
		 final int hel=56;
		final class Inner
		{
			String arthi="mahe";
			void display()
			{
				System.out.println("Hello "+arthi + " "+hel+ " "+ name+ " "+a);				
			}
						
		}
		Inner in=new Inner();
		in.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass lc=new LocalInnerClass();
		lc.method();
	}

}
