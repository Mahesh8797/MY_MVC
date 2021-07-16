package OOPSConcepts;

class Alphabets
{
	void run()
	{
		System.out.println("running");
	}
}

public class ClassCasting  extends Alphabets{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting -  Assigning the subclass instance to a superclass variable
		ClassCasting cc=new ClassCasting();
		Alphabets a=cc; //implicit casting takes place (ClassCasting)cc
		a.run();
		
		//down casting - Assigning the super class instance to a subclass variable using explicit casting
		// --- java.lang.ClassCastException: 
		/*Alphabets ab=new Alphabets();
		ClassCasting ccc=(ClassCasting)ab;
		ccc.run();*/
		
		//down casting - Assigning the super class instance to a subclass variable using explicit casting
		ClassCasting abc=new ClassCasting();
		Alphabets def=abc;
		ClassCasting gh=(ClassCasting)def;
		gh.run();

	}

}
