package OOPSConcepts;

 class Simple {

	static
	{
		
		System.out.println("Hello i am first static block");
	}
	static int count=10;
	static class Inner
	{
		static int b=10;
		static int a;
		void print()
		{
			System.out.println("Hello i am method");
		}
		static
		{
			a=20;
			System.out.println("Hello i am second static block");
		}
	}
 }	
	public class StaticNested extends Simple
	{
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNested sn=new StaticNested();
	System.out.println(count);
	Simple.Inner in=new Simple.Inner();
	in.print();
	}

}
