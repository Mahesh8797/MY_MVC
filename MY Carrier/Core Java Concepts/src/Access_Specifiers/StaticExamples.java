package Access_Specifiers;

import Access_Specifiers.sample.Inner;

class sample
{
	static
	{
		 int num=5;
		System.out.println("Hello "+ num);
	}
	static int count;
	static void print()
	{
		System.out.println("hello" + count);
	}
	static class Inner
	{
		static String name="Mahe";
		int a=10;
		 void display()
		{
		System.out.println(name);
	}
}
}

public class StaticExamples extends Inner
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  sample s=new sample();
  s.count=10;
  s.print();
  sample.Inner in =new sample.Inner();
  in.display();
  System.out.println(in.a);
  
	}

}
