package OOPSConcepts;

class mahesh
{
	public void show()
	{
		System.out.println("all are best");
	}
}
//if i want to print some other data but for the same method then we override it
interface my
{
	void print();
}
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instead of overriding i created anonymous class which have no class name but has body in it and useful when code is not reusable
		mahesh a=new mahesh()
				{
			public void show()
			{
				System.out.println("I am the best");
			}
				};
		a.show();
		my m=new my()
				{
			        public void print()
			        {
			        	System.out.println("I am not in good state now");
			        }
				};
				m.print();
	}

}
