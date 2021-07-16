package ArrayConcepts;

public class varArgs {

	varArgs(int...b)
	{
		for(int c: b)
		System.out.println(c);
	}
	void print(int abc, String...str)
	{
		System.out.println(abc);
		for(String s:str)
		{
			System.out.print(s+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varArgs var=new varArgs(10,20,30);
		
		var.print(10, "My", "name","is","mahe");

	}

}
