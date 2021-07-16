package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingEmailAddress {

	String email_exp="[\\w\\d]+@[\\w]+.\\w{3,4}";
	Pattern pattern=Pattern.compile(email_exp, Pattern.CASE_INSENSITIVE);
	Matcher matcher;
	
	public boolean validate(String emails)
	{
		matcher=pattern.matcher(emails);
		return matcher.matches();
		
	}
	public static void main(String[] args) {
		
		
		String emails[]={"mahey@gmail.com",".mahe@dfd.com","yoge32@ayjk.com","@dgsfd@.com","243kjfj@gfg.com","yogemahe43@gmai.com"};
		
		ValidatingEmailAddress vea=new ValidatingEmailAddress();
		for(String email : emails)
		{
			System.out.println(" Is email id valid ? "+ email +" "+vea.validate(email));
			
		}
		}

	}


