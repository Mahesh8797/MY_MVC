package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingPhoneNumber {

	Pattern pattern=Pattern.compile("\\d{10}");
	Pattern pattern1=Pattern.compile("\\d{3}[-\\.\\s]\\d{3}\\[-\\.\\s]\\d{3}");
	Pattern pattern2=Pattern.compile("(\\d{3})[-\\.\\s]d{6}");
	Matcher matcher;
	boolean validate(String phone)
	{
		if(phone.matches("\\d{10}"))
         return true;
		else if(phone.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}"))
		{
			 return true;
		}
		else if(phone.matches("\\(\\d{3}\\)[-\\.\\s]\\d{6}"))
		{
			 return true;
		}
		else
		return false;
		
	}
	public static void main(String[] args) 
	{
		String []numbers={"!#$57^$%345","(123)-465543","5435-4354-45463","435 565 343","3547768692"};
		ValidatingPhoneNumber vpn=new ValidatingPhoneNumber();
		for(String num : numbers)
		{
			System.out.println("Is phone number is valid "+num +" "+vpn.validate(num));
		}
		
	}

}
