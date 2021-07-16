package StringConcepts;

public class StringSubStringPalindrome {

	private static boolean CheckPalindrome(String str)
	{
		if(str== null)
		{
			System.out.println("Not a valid string");
		}
		if (str.length() <= 1) {
			return true;
		}
			String first=str.substring(0, 1);
			String last=str.substring(str.length()-1);
			if(!first.equals(last))			
            return false;			
			else
			return CheckPalindrome(str.substring(1, str.length()-1));
			
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(CheckPalindrome("madam"));
		System.out.println(CheckPalindrome("xyabyx"));
		System.out.println(CheckPalindrome("871232178"));
		//System.out.println(CheckPalindrome(null));
		
	}

}
