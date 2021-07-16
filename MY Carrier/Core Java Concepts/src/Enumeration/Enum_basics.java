package Enumeration;
	enum Names
	{
		Mahe,Aarthi,Kanya,Kalpana;	
	}
	public class Enum_basics {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println(Names.Kalpana);
			for(Names m: Names.values())
			{
				System.out.println(m);
			}
			//switch case in enum
			Names n=Names.Aarthi;
			switch(n)
			{
			
			case Mahe:
				System.out.println("Name is mahe");
				break;
			case Aarthi:
				System.out.println("Name is Aarthi");
				break;
			//case Yog: //not defined hence throws error
				
			}
		}

	}