class Sampl1
{
	private void show()
	{		
		System.out.println("I am a private method outside the class");
	}
}

public class AccessModifiersAndSpecifiers extends Sampl1{
	static int b=20;
	static
	{
		System.out.println("Static block is executed first");
	}
	AccessModifiersAndSpecifiers()
	{
		System.out.println("Constructors will be called only after static block");
	}
	protected int a=10;
	private void print()
	{		
		System.out.println("I am a private method "+a);
	}
	protected static void display()
	{
		System.out.println("I am a static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiersAndSpecifiers am=new AccessModifiersAndSpecifiers();
		am.print();
		Sampl1 s=new Sampl1();
		//s.show();  
		for(int i=0;i<3;i++)
		{
			display();
			if(i==2)
				break;		
		}
		for(int j=0;j<2;j++)
		{
			if(j==1)
				continue;
			am.print();
		}
			
	}

}
