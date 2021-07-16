package BaiscPrograms;

public class Palindrome {

	public static boolean checkPalin(String name)
	{
		if(name==null)
		{
			System.out.println("string is null");
		}
		if(name.length()<=1)
		{
			return true;
		}
		String first=name.substring(0,1);
		String last=name.substring(name.length()-1);
		if(!first.equals(last))
			return false;
		else
			//int num=name.length()-1;
			return checkPalin(name.substring(1,name.length()-1));
		}
	
	
	public static void main(String[] args) {
		

		System.out.println(checkPalin("madam"));
	}

}
