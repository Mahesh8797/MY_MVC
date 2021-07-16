package OOPSConcepts;
class Sample1
{
	int ab=10;
	void print()
	{
		int a=10;
		System.out.println("Print the super class value "+ab +" "+a);
	}
}

public class SingleInheritance extends Sample1 {

	void display()
	{
		System.out.println("Print the sub class value "+ab);
	}
	@Override //override is used to throw error if any of the superclass method(which is inherited) are changed
	void print()
	{
		System.out.println("Print the super class value "+ab +" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance si=new SingleInheritance();
		si.display();
		si.print();
 
	}

}
