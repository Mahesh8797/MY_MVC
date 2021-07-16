package OOPSConcepts;

class A
{
	void run()
	{
		System.out.print("I am the super class");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("I am the subclass");
	}
}
public class HierarchicalInheritance extends A {

	void print()
	{
		System.out.println("I am the subclass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalInheritance hi =new HierarchicalInheritance();
		hi.print();
		hi.run();
		B b=new B(); //we need to create a object separately as both the subclasses are independent of each other
		System.out.println();
		b.show();
		b.run();
		
	}

}
