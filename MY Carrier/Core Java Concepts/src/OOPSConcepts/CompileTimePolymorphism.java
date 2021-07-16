package OOPSConcepts;

public class CompileTimePolymorphism {

	public int print(int num1,int num2)
	{
		return num1+num2;
		
	}
	public int print(int num3, int num4, int num5)
	{
		return num3+num4+num5;
	}
	public double print(double num6, double num7)
	{
		return num6+num7;
	}
	/*public double print(int num8, int num9) //throws error as if the return type is alone changed and the arguments remains the same
	{
		return num8+num9;
	}*/
	
	//<Method overloading along with type promotion
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sum(long a, long b, long c)
	{
		System.out.println(a+b+c);
	}
	public void display(int a, long b)
	{
		System.out.println("Int agrg " + a+b);
	}
	public void display(long a, long b) 
	{
		System.out.println("Long arg" +a+b);
	}
	public void show(int a, long b)
	{
		System.out.println(a+b);
	}
	public void show(long  a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphism cp=new CompileTimePolymorphism();
		System.out.println(cp.print(10, 20));
		System.out.println(cp.print(30, 40,50));
		System.out.println(cp.print(100.98, 200.97));
		cp.sum(10,20);
		cp.sum(10, 20,30);
		cp.display(20, 30);
	//	cp.show(40, 40); ///here it shows ambigous type as there are two methods with different type promotion
	}

}
