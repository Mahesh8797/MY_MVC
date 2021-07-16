package Enumeration;

/*class Names
{
	static final Names Mahe=new Names();
	static final Names Aarthi=new Names();
	static final Names Kanya=new Names();
	static final Names Kalpana=new Names();
}*/

enum Name
{
	Mahe(20),Aarthi,Kanya(33),Kalpana(26);	
	
	int age;
	Name()
	{
		
	  this.age=23;
	  System.out.println("Cons");
	}
	Name(int age)
	{
		this.age=age;
	}
	public int getAge()
	{		
		return age;		
	}
}
public class Enum_Constructors_Var_Methods {

	public static void main(String[] args) {
		
   System.out.println("Age of Aarthi "+Name.Aarthi.getAge());
   System.out.println("Age of Mahe "+Name.Mahe.getAge());
   System.out.println("Age of Kanya "+Name.Kanya.getAge());
   System.out.println("Age of Kalpana "+Name.Kalpana.getAge());

	}

}
