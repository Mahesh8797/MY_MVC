package Java_7_Features;

public class SwitchCase_Strings {

	public static void UsingIf(String s)
	{
		if(s.equals("blue"))
		{
			System.out.println("Blue");
		}
		else if(s.equals("RED"))
		{
			System.out.println("Red");
		}
		else
		{
			System.out.println("Invalid code");
		}
	}
	public static void UsingSwitch(String s)
	{
		switch(s)
		{
		case  "BLUE":
			System.out.println("Blue");
			break;
		case  "RED":
			System.out.println("RED");
			break;
		case "red":
			System.out.println("RED");
			break;
		default:
			System.out.println("Invalid code");
		}
	}
	public static void main(String[] args)
	{
	
		UsingIf("RED");
		UsingSwitch("RED");
		
		UsingSwitch("blue");
		UsingIf(null);
			
	}

}
