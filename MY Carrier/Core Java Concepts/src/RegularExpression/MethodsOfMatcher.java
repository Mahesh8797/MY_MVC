package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsOfMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MATCHER METHODS
		Pattern pattern=Pattern.compile("yoge", Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("yogemaheYOGEmaheyoge");
		while(matcher.find())
		{
			System.out.println("Found the pattern "+matcher.group()+ " starting at index "+matcher.start()+ " ending at index "+matcher.end());
		}
		
		//SPLIT STRING
		Pattern pat=Pattern.compile("\\W");
		String s[]=pat.split("mahe@Yoge#mayo%thangam^love");
		for(String words: s)
		{
			System.out.println("Splitted words "+words);
		}
		
		//STRING METHODS
		Pattern p=Pattern.compile("1*2");
		Matcher match=p.matcher("1221347812154");
		System.out.println(match.replaceAll("love"));
		System.out.println(match.replaceFirst("yoge"));
		
	}

}
