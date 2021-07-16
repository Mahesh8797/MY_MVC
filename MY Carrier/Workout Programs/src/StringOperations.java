import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc";
		String s2="def";
		String s3=new String("abc");
		s3=s3.intern();
		System.out.println("If s1==s3 "+s1==s3);
		String s4="Maheshwari alice Aarthi";
		System.out.println("Subsequence "+s4.subSequence(0, 5));
		System.out.println("SubString "+s4.substring(0, 5));
		System.out.println("Last 4 characters "+s4.substring((s4.length())-4, s4.length()));
		String s5="ADFD";
		String s6="AHEE";
		String s7="adfd";
		System.out.println("Result is "+s5.compareTo(s6));
		System.out.println("Result is "+s5.compareToIgnoreCase(s7));
		String s8="Mahe";
		char arr[]=s8.toCharArray();
		System.out.println(Arrays.toString(arr));
		char a=s8.charAt(2);
		System.out.println("The character At index 2 "+a);
		char a1[]={'y','o','g'};
		String str=new String(a1);
		System.out.println("char to stirng con "+str);
		String s9="Dear babe miss you";
		String res[]=s9.split(" ");
		System.out.println("Spllited sting "+Arrays.toString(res));
		String s10="hi/hello/welcome/";
		String re[]=s10.split("/", 2);
		System.out.println("Spllited sting "+Arrays.toString(re));
		String s11="Maheshwari";
		System.out.println("Is contains "+s11.contains("hesh"));
		System.out.println("Index of e "+s11.indexOf('e'));
		System.out.println("Replace "+s11.replace('a', 'A'));
		s11.codePoints().forEach(i->System.out.print(i+ " "));		
		int high=30;
	    String s14=String.valueOf(high); 
	    System.out.println(s14+10);
	    String s12=" Hi Baby ";
		System.out.println(s12.trim());
		String s13=null;		
		System.out.println(s13);
		s13.trim();
		System.out.println(s13);
		
		s11=s11.concat(" how are you");
		System.out.println(s11);
		
		StringBuffer sb=new StringBuffer("Mahe");
		sb.append("y");
		System.out.println(sb);
		sb.insert(1, "baby");
		System.out.println(sb);
		sb.replace(3, 6, "yogesh");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
