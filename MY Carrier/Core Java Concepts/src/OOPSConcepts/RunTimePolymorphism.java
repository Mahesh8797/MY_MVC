package OOPSConcepts;
class  CSE
{
	int num=10;
	 void print()
	{
		System.out.println("I am the method of CSE");
	}
}
class ECE extends CSE
{
	void print()
	{
	System.out.println("I am the method of ECE "+ num);
    }
}
public class RunTimePolymorphism extends ECE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTimePolymorphism rp=new RunTimePolymorphism();
		rp.print();
		CSE s=new CSE();
		s.print();
	}

}
