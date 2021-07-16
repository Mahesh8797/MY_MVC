package Constructors;

public class ParamConstructor {
	ParamConstructor()
	{
		System.out.println("I am single");
	}
	ParamConstructor(String name)
	{
		System.out.println("My name is " + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParamConstructor pc=new ParamConstructor();
		pc=new ParamConstructor("MY");
	}

}
