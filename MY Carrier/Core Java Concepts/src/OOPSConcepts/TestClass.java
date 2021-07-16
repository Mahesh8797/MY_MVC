package OOPSConcepts;

 class Class {
	
	int a=10;
	protected class InnerClass1
	{
		void print()
		{
			System.out.println("I am first inner class");
		}
	}
	protected class InnerClass2 extends InnerClass1
	{
		void print()
		{
			System.out.println("I am second inner class");
		}
	}
 }
	public class TestClass extends Class {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestClass tc=new TestClass();
TestClass.InnerClass1 in1=tc.new InnerClass1();
TestClass.InnerClass2 in2=tc.new InnerClass2();
in1.print();
in2.print();
	}

}
