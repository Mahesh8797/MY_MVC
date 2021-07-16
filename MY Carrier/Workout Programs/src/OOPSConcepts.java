class A
{
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}	
}


public class OOPSConcepts extends A{
	static int c=20;
	void print()
	{
		class LocalInner
		{
			void display()
			{
				System.out.println("local inner "+c);
			}
		}
		LocalInner li=new LocalInner();
		li.display();
		
	}

	protected class inner 
	{
		void show()
		{
			System.out.println("I am an inner class "+c);
		}
	}
	static class outer
	{
		static
		{
			System.out.println("I am static");
		}
		 void hello()
		{
			System.out.println("I am static method");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPSConcepts oops=new OOPSConcepts();
		oops.setA(10);
		System.out.println(oops.getA());
		
		OOPSConcepts.inner in=oops.new inner();
		in.show();
		oops.print();
		
		OOPSConcepts.outer out=new OOPSConcepts.outer();
		out.hello();
		
	}

}
