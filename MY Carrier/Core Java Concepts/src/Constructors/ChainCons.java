package Constructors;
public class ChainCons {
	int num;
	String name;
	ChainCons()
	{
		this("aarthi");
		System.out.println("No Args constructor");
	}
	ChainCons(String name)
	{
		this(10, "mahe");
		//this.name=name;
		System.out.println("constructor with single args");
	}
	ChainCons(int num, String name)
	{
		this.num=num;
		this.name=name;
		System.out.println(" multiple args constructor");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainCons cc=new ChainCons();
		System.out.println(cc);
		cc=new ChainCons("Y");
		System.out.println(cc);
		cc=new ChainCons(20,"og");
		System.out.println(cc);				
	}
	public String toString()
	{
		return "ID :" + num + " Name: "+ name;
	}	
}
