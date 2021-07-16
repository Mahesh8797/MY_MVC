package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicsAndCapturingGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p=Pattern.compile("([a-z])[0-9]\\1");
		Matcher m=p.matcher("d5d");
		System.out.println(Pattern.matches("([a-z])[0-9]\\1","d5d"));
		System.out.println(Pattern.matches("([a-z])[0-9]\\1","d5e"));
		System.out.println(Pattern.matches("(ABC)(BD)[0-8]\\2\\1","ABCBD7BDABC"));
				
	}

}
