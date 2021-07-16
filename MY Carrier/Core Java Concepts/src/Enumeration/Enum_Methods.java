package Enumeration;
enum Nam
{
	Mahe(20),Aarthi(23),Kanya(33),Kalpana(26);	
	
	int value;
	private Nam(int value)
	{
		this.value=value;
	}
}
public class Enum_Methods {

	public static void main(String[] args) {
	
		//Nam m=new Nam(); //cannot create object of enum using new keyword as it has private constructor
		Nam m[]=Nam.values();
		for(Nam n: m)
		{
			System.out.println(n + " "+n.value);
		}

		System.out.println(Nam.valueOf("Mahe")); //value of provides the constant values
		
		System.out.println(Nam.Kanya.ordinal()); //gives the index number
	}

}
